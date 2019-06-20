/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.billing.v2018_11_01_preview.ErrorResponseException;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Agreements.
 */
public class AgreementsInner {
    /** The Retrofit service to perform REST calls. */
    private AgreementsService service;
    /** The service client containing this operation class. */
    private BillingManagementClientImpl client;

    /**
     * Initializes an instance of AgreementsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public AgreementsInner(Retrofit retrofit, BillingManagementClientImpl client) {
        this.service = retrofit.create(AgreementsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Agreements to be
     * used by Retrofit to perform actually REST calls.
     */
    interface AgreementsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2018_11_01_preview.Agreements listByBillingAccountName" })
        @GET("providers/Microsoft.Billing/billingAccounts/{billingAccountName}/agreements")
        Observable<Response<ResponseBody>> listByBillingAccountName(@Path("billingAccountName") String billingAccountName, @Query("api-version") String apiVersion, @Query("$expand") String expand, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2018_11_01_preview.Agreements get" })
        @GET("providers/Microsoft.Billing/billingAccounts/{billingAccountName}/agreements/{agreementName}")
        Observable<Response<ResponseBody>> get(@Path("billingAccountName") String billingAccountName, @Path("agreementName") String agreementName, @Query("api-version") String apiVersion, @Query("$expand") String expand, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2018_11_01_preview.Agreements listByBillingAccountNameNext" })
        @GET
        Observable<Response<ResponseBody>> listByBillingAccountNameNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists all agreements for a billing account.
     *
     * @param billingAccountName Billing Account Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;AgreementInner&gt; object if successful.
     */
    public PagedList<AgreementInner> listByBillingAccountName(final String billingAccountName) {
        ServiceResponse<Page<AgreementInner>> response = listByBillingAccountNameSinglePageAsync(billingAccountName).toBlocking().single();
        return new PagedList<AgreementInner>(response.body()) {
            @Override
            public Page<AgreementInner> nextPage(String nextPageLink) {
                return listByBillingAccountNameNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists all agreements for a billing account.
     *
     * @param billingAccountName Billing Account Id.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<AgreementInner>> listByBillingAccountNameAsync(final String billingAccountName, final ListOperationCallback<AgreementInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByBillingAccountNameSinglePageAsync(billingAccountName),
            new Func1<String, Observable<ServiceResponse<Page<AgreementInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AgreementInner>>> call(String nextPageLink) {
                    return listByBillingAccountNameNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists all agreements for a billing account.
     *
     * @param billingAccountName Billing Account Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;AgreementInner&gt; object
     */
    public Observable<Page<AgreementInner>> listByBillingAccountNameAsync(final String billingAccountName) {
        return listByBillingAccountNameWithServiceResponseAsync(billingAccountName)
            .map(new Func1<ServiceResponse<Page<AgreementInner>>, Page<AgreementInner>>() {
                @Override
                public Page<AgreementInner> call(ServiceResponse<Page<AgreementInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists all agreements for a billing account.
     *
     * @param billingAccountName Billing Account Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;AgreementInner&gt; object
     */
    public Observable<ServiceResponse<Page<AgreementInner>>> listByBillingAccountNameWithServiceResponseAsync(final String billingAccountName) {
        return listByBillingAccountNameSinglePageAsync(billingAccountName)
            .concatMap(new Func1<ServiceResponse<Page<AgreementInner>>, Observable<ServiceResponse<Page<AgreementInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AgreementInner>>> call(ServiceResponse<Page<AgreementInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByBillingAccountNameNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists all agreements for a billing account.
     *
     * @param billingAccountName Billing Account Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;AgreementInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<AgreementInner>>> listByBillingAccountNameSinglePageAsync(final String billingAccountName) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String expand = null;
        return service.listByBillingAccountName(billingAccountName, this.client.apiVersion(), expand, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<AgreementInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AgreementInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<AgreementInner>> result = listByBillingAccountNameDelegate(response);
                        return Observable.just(new ServiceResponse<Page<AgreementInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Lists all agreements for a billing account.
     *
     * @param billingAccountName Billing Account Id.
     * @param expand May be used to expand the participants.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;AgreementInner&gt; object if successful.
     */
    public PagedList<AgreementInner> listByBillingAccountName(final String billingAccountName, final String expand) {
        ServiceResponse<Page<AgreementInner>> response = listByBillingAccountNameSinglePageAsync(billingAccountName, expand).toBlocking().single();
        return new PagedList<AgreementInner>(response.body()) {
            @Override
            public Page<AgreementInner> nextPage(String nextPageLink) {
                return listByBillingAccountNameNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists all agreements for a billing account.
     *
     * @param billingAccountName Billing Account Id.
     * @param expand May be used to expand the participants.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<AgreementInner>> listByBillingAccountNameAsync(final String billingAccountName, final String expand, final ListOperationCallback<AgreementInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByBillingAccountNameSinglePageAsync(billingAccountName, expand),
            new Func1<String, Observable<ServiceResponse<Page<AgreementInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AgreementInner>>> call(String nextPageLink) {
                    return listByBillingAccountNameNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists all agreements for a billing account.
     *
     * @param billingAccountName Billing Account Id.
     * @param expand May be used to expand the participants.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;AgreementInner&gt; object
     */
    public Observable<Page<AgreementInner>> listByBillingAccountNameAsync(final String billingAccountName, final String expand) {
        return listByBillingAccountNameWithServiceResponseAsync(billingAccountName, expand)
            .map(new Func1<ServiceResponse<Page<AgreementInner>>, Page<AgreementInner>>() {
                @Override
                public Page<AgreementInner> call(ServiceResponse<Page<AgreementInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists all agreements for a billing account.
     *
     * @param billingAccountName Billing Account Id.
     * @param expand May be used to expand the participants.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;AgreementInner&gt; object
     */
    public Observable<ServiceResponse<Page<AgreementInner>>> listByBillingAccountNameWithServiceResponseAsync(final String billingAccountName, final String expand) {
        return listByBillingAccountNameSinglePageAsync(billingAccountName, expand)
            .concatMap(new Func1<ServiceResponse<Page<AgreementInner>>, Observable<ServiceResponse<Page<AgreementInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AgreementInner>>> call(ServiceResponse<Page<AgreementInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByBillingAccountNameNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists all agreements for a billing account.
     *
    ServiceResponse<PageImpl<AgreementInner>> * @param billingAccountName Billing Account Id.
    ServiceResponse<PageImpl<AgreementInner>> * @param expand May be used to expand the participants.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;AgreementInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<AgreementInner>>> listByBillingAccountNameSinglePageAsync(final String billingAccountName, final String expand) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByBillingAccountName(billingAccountName, this.client.apiVersion(), expand, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<AgreementInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AgreementInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<AgreementInner>> result = listByBillingAccountNameDelegate(response);
                        return Observable.just(new ServiceResponse<Page<AgreementInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<AgreementInner>> listByBillingAccountNameDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<AgreementInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<AgreementInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Get the agreement by name.
     *
     * @param billingAccountName Billing Account Id.
     * @param agreementName Agreement Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AgreementInner object if successful.
     */
    public AgreementInner get(String billingAccountName, String agreementName) {
        return getWithServiceResponseAsync(billingAccountName, agreementName).toBlocking().single().body();
    }

    /**
     * Get the agreement by name.
     *
     * @param billingAccountName Billing Account Id.
     * @param agreementName Agreement Id.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AgreementInner> getAsync(String billingAccountName, String agreementName, final ServiceCallback<AgreementInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(billingAccountName, agreementName), serviceCallback);
    }

    /**
     * Get the agreement by name.
     *
     * @param billingAccountName Billing Account Id.
     * @param agreementName Agreement Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AgreementInner object
     */
    public Observable<AgreementInner> getAsync(String billingAccountName, String agreementName) {
        return getWithServiceResponseAsync(billingAccountName, agreementName).map(new Func1<ServiceResponse<AgreementInner>, AgreementInner>() {
            @Override
            public AgreementInner call(ServiceResponse<AgreementInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get the agreement by name.
     *
     * @param billingAccountName Billing Account Id.
     * @param agreementName Agreement Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AgreementInner object
     */
    public Observable<ServiceResponse<AgreementInner>> getWithServiceResponseAsync(String billingAccountName, String agreementName) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (agreementName == null) {
            throw new IllegalArgumentException("Parameter agreementName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String expand = null;
        return service.get(billingAccountName, agreementName, this.client.apiVersion(), expand, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AgreementInner>>>() {
                @Override
                public Observable<ServiceResponse<AgreementInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AgreementInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Get the agreement by name.
     *
     * @param billingAccountName Billing Account Id.
     * @param agreementName Agreement Id.
     * @param expand May be used to expand the participants.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AgreementInner object if successful.
     */
    public AgreementInner get(String billingAccountName, String agreementName, String expand) {
        return getWithServiceResponseAsync(billingAccountName, agreementName, expand).toBlocking().single().body();
    }

    /**
     * Get the agreement by name.
     *
     * @param billingAccountName Billing Account Id.
     * @param agreementName Agreement Id.
     * @param expand May be used to expand the participants.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AgreementInner> getAsync(String billingAccountName, String agreementName, String expand, final ServiceCallback<AgreementInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(billingAccountName, agreementName, expand), serviceCallback);
    }

    /**
     * Get the agreement by name.
     *
     * @param billingAccountName Billing Account Id.
     * @param agreementName Agreement Id.
     * @param expand May be used to expand the participants.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AgreementInner object
     */
    public Observable<AgreementInner> getAsync(String billingAccountName, String agreementName, String expand) {
        return getWithServiceResponseAsync(billingAccountName, agreementName, expand).map(new Func1<ServiceResponse<AgreementInner>, AgreementInner>() {
            @Override
            public AgreementInner call(ServiceResponse<AgreementInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get the agreement by name.
     *
     * @param billingAccountName Billing Account Id.
     * @param agreementName Agreement Id.
     * @param expand May be used to expand the participants.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AgreementInner object
     */
    public Observable<ServiceResponse<AgreementInner>> getWithServiceResponseAsync(String billingAccountName, String agreementName, String expand) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (agreementName == null) {
            throw new IllegalArgumentException("Parameter agreementName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(billingAccountName, agreementName, this.client.apiVersion(), expand, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AgreementInner>>>() {
                @Override
                public Observable<ServiceResponse<AgreementInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AgreementInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AgreementInner> getDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<AgreementInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<AgreementInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Lists all agreements for a billing account.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;AgreementInner&gt; object if successful.
     */
    public PagedList<AgreementInner> listByBillingAccountNameNext(final String nextPageLink) {
        ServiceResponse<Page<AgreementInner>> response = listByBillingAccountNameNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<AgreementInner>(response.body()) {
            @Override
            public Page<AgreementInner> nextPage(String nextPageLink) {
                return listByBillingAccountNameNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists all agreements for a billing account.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<AgreementInner>> listByBillingAccountNameNextAsync(final String nextPageLink, final ServiceFuture<List<AgreementInner>> serviceFuture, final ListOperationCallback<AgreementInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByBillingAccountNameNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<AgreementInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AgreementInner>>> call(String nextPageLink) {
                    return listByBillingAccountNameNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists all agreements for a billing account.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;AgreementInner&gt; object
     */
    public Observable<Page<AgreementInner>> listByBillingAccountNameNextAsync(final String nextPageLink) {
        return listByBillingAccountNameNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<AgreementInner>>, Page<AgreementInner>>() {
                @Override
                public Page<AgreementInner> call(ServiceResponse<Page<AgreementInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists all agreements for a billing account.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;AgreementInner&gt; object
     */
    public Observable<ServiceResponse<Page<AgreementInner>>> listByBillingAccountNameNextWithServiceResponseAsync(final String nextPageLink) {
        return listByBillingAccountNameNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<AgreementInner>>, Observable<ServiceResponse<Page<AgreementInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AgreementInner>>> call(ServiceResponse<Page<AgreementInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByBillingAccountNameNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists all agreements for a billing account.
     *
    ServiceResponse<PageImpl<AgreementInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;AgreementInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<AgreementInner>>> listByBillingAccountNameNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listByBillingAccountNameNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<AgreementInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AgreementInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<AgreementInner>> result = listByBillingAccountNameNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<AgreementInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<AgreementInner>> listByBillingAccountNameNextDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<AgreementInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<AgreementInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}