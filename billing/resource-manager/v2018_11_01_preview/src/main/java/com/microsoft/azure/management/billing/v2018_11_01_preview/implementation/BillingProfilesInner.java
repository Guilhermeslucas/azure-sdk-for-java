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
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingProfilesUpdateHeaders;
import com.microsoft.azure.management.billing.v2018_11_01_preview.ErrorResponseException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseWithHeaders;
import com.microsoft.rest.Validator;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in BillingProfiles.
 */
public class BillingProfilesInner {
    /** The Retrofit service to perform REST calls. */
    private BillingProfilesService service;
    /** The service client containing this operation class. */
    private BillingManagementClientImpl client;

    /**
     * Initializes an instance of BillingProfilesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public BillingProfilesInner(Retrofit retrofit, BillingManagementClientImpl client) {
        this.service = retrofit.create(BillingProfilesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for BillingProfiles to be
     * used by Retrofit to perform actually REST calls.
     */
    interface BillingProfilesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2018_11_01_preview.BillingProfiles get" })
        @GET("providers/Microsoft.Billing/billingAccounts/{billingAccountName}/billingProfiles/{billingProfileName}")
        Observable<Response<ResponseBody>> get(@Path("billingAccountName") String billingAccountName, @Path("billingProfileName") String billingProfileName, @Query("api-version") String apiVersion, @Query("$expand") String expand, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2018_11_01_preview.BillingProfiles update" })
        @PUT("providers/Microsoft.Billing/billingAccounts/{billingAccountName}/billingProfiles/{billingProfileName}")
        Observable<Response<ResponseBody>> update(@Path("billingAccountName") String billingAccountName, @Path("billingProfileName") String billingProfileName, @Query("api-version") String apiVersion, @Body BillingProfileInner parameters, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2018_11_01_preview.BillingProfiles beginUpdate" })
        @PUT("providers/Microsoft.Billing/billingAccounts/{billingAccountName}/billingProfiles/{billingProfileName}")
        Observable<Response<ResponseBody>> beginUpdate(@Path("billingAccountName") String billingAccountName, @Path("billingProfileName") String billingProfileName, @Query("api-version") String apiVersion, @Body BillingProfileInner parameters, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Get the billing profile by id.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BillingProfileInner object if successful.
     */
    public BillingProfileInner get(String billingAccountName, String billingProfileName) {
        return getWithServiceResponseAsync(billingAccountName, billingProfileName).toBlocking().single().body();
    }

    /**
     * Get the billing profile by id.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BillingProfileInner> getAsync(String billingAccountName, String billingProfileName, final ServiceCallback<BillingProfileInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(billingAccountName, billingProfileName), serviceCallback);
    }

    /**
     * Get the billing profile by id.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BillingProfileInner object
     */
    public Observable<BillingProfileInner> getAsync(String billingAccountName, String billingProfileName) {
        return getWithServiceResponseAsync(billingAccountName, billingProfileName).map(new Func1<ServiceResponse<BillingProfileInner>, BillingProfileInner>() {
            @Override
            public BillingProfileInner call(ServiceResponse<BillingProfileInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get the billing profile by id.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BillingProfileInner object
     */
    public Observable<ServiceResponse<BillingProfileInner>> getWithServiceResponseAsync(String billingAccountName, String billingProfileName) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (billingProfileName == null) {
            throw new IllegalArgumentException("Parameter billingProfileName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String expand = null;
        return service.get(billingAccountName, billingProfileName, this.client.apiVersion(), expand, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BillingProfileInner>>>() {
                @Override
                public Observable<ServiceResponse<BillingProfileInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BillingProfileInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Get the billing profile by id.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param expand May be used to expand the invoiceSections.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BillingProfileInner object if successful.
     */
    public BillingProfileInner get(String billingAccountName, String billingProfileName, String expand) {
        return getWithServiceResponseAsync(billingAccountName, billingProfileName, expand).toBlocking().single().body();
    }

    /**
     * Get the billing profile by id.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param expand May be used to expand the invoiceSections.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BillingProfileInner> getAsync(String billingAccountName, String billingProfileName, String expand, final ServiceCallback<BillingProfileInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(billingAccountName, billingProfileName, expand), serviceCallback);
    }

    /**
     * Get the billing profile by id.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param expand May be used to expand the invoiceSections.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BillingProfileInner object
     */
    public Observable<BillingProfileInner> getAsync(String billingAccountName, String billingProfileName, String expand) {
        return getWithServiceResponseAsync(billingAccountName, billingProfileName, expand).map(new Func1<ServiceResponse<BillingProfileInner>, BillingProfileInner>() {
            @Override
            public BillingProfileInner call(ServiceResponse<BillingProfileInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get the billing profile by id.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param expand May be used to expand the invoiceSections.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BillingProfileInner object
     */
    public Observable<ServiceResponse<BillingProfileInner>> getWithServiceResponseAsync(String billingAccountName, String billingProfileName, String expand) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (billingProfileName == null) {
            throw new IllegalArgumentException("Parameter billingProfileName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(billingAccountName, billingProfileName, this.client.apiVersion(), expand, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BillingProfileInner>>>() {
                @Override
                public Observable<ServiceResponse<BillingProfileInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BillingProfileInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<BillingProfileInner> getDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<BillingProfileInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<BillingProfileInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * The operation to update a billing profile.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param parameters Parameters supplied to the update billing profile operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BillingProfileInner object if successful.
     */
    public BillingProfileInner update(String billingAccountName, String billingProfileName, BillingProfileInner parameters) {
        return updateWithServiceResponseAsync(billingAccountName, billingProfileName, parameters).toBlocking().last().body();
    }

    /**
     * The operation to update a billing profile.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param parameters Parameters supplied to the update billing profile operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BillingProfileInner> updateAsync(String billingAccountName, String billingProfileName, BillingProfileInner parameters, final ServiceCallback<BillingProfileInner> serviceCallback) {
        return ServiceFuture.fromHeaderResponse(updateWithServiceResponseAsync(billingAccountName, billingProfileName, parameters), serviceCallback);
    }

    /**
     * The operation to update a billing profile.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param parameters Parameters supplied to the update billing profile operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<BillingProfileInner> updateAsync(String billingAccountName, String billingProfileName, BillingProfileInner parameters) {
        return updateWithServiceResponseAsync(billingAccountName, billingProfileName, parameters).map(new Func1<ServiceResponseWithHeaders<BillingProfileInner, BillingProfilesUpdateHeaders>, BillingProfileInner>() {
            @Override
            public BillingProfileInner call(ServiceResponseWithHeaders<BillingProfileInner, BillingProfilesUpdateHeaders> response) {
                return response.body();
            }
        });
    }

    /**
     * The operation to update a billing profile.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param parameters Parameters supplied to the update billing profile operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponseWithHeaders<BillingProfileInner, BillingProfilesUpdateHeaders>> updateWithServiceResponseAsync(String billingAccountName, String billingProfileName, BillingProfileInner parameters) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (billingProfileName == null) {
            throw new IllegalArgumentException("Parameter billingProfileName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        Observable<Response<ResponseBody>> observable = service.update(billingAccountName, billingProfileName, this.client.apiVersion(), parameters, this.client.acceptLanguage(), this.client.userAgent());
        return client.getAzureClient().getPutOrPatchResultWithHeadersAsync(observable, new TypeToken<BillingProfileInner>() { }.getType(), BillingProfilesUpdateHeaders.class);
    }

    /**
     * The operation to update a billing profile.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param parameters Parameters supplied to the update billing profile operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BillingProfileInner object if successful.
     */
    public BillingProfileInner beginUpdate(String billingAccountName, String billingProfileName, BillingProfileInner parameters) {
        return beginUpdateWithServiceResponseAsync(billingAccountName, billingProfileName, parameters).toBlocking().single().body();
    }

    /**
     * The operation to update a billing profile.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param parameters Parameters supplied to the update billing profile operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BillingProfileInner> beginUpdateAsync(String billingAccountName, String billingProfileName, BillingProfileInner parameters, final ServiceCallback<BillingProfileInner> serviceCallback) {
        return ServiceFuture.fromHeaderResponse(beginUpdateWithServiceResponseAsync(billingAccountName, billingProfileName, parameters), serviceCallback);
    }

    /**
     * The operation to update a billing profile.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param parameters Parameters supplied to the update billing profile operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BillingProfileInner object
     */
    public Observable<BillingProfileInner> beginUpdateAsync(String billingAccountName, String billingProfileName, BillingProfileInner parameters) {
        return beginUpdateWithServiceResponseAsync(billingAccountName, billingProfileName, parameters).map(new Func1<ServiceResponseWithHeaders<BillingProfileInner, BillingProfilesUpdateHeaders>, BillingProfileInner>() {
            @Override
            public BillingProfileInner call(ServiceResponseWithHeaders<BillingProfileInner, BillingProfilesUpdateHeaders> response) {
                return response.body();
            }
        });
    }

    /**
     * The operation to update a billing profile.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param parameters Parameters supplied to the update billing profile operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BillingProfileInner object
     */
    public Observable<ServiceResponseWithHeaders<BillingProfileInner, BillingProfilesUpdateHeaders>> beginUpdateWithServiceResponseAsync(String billingAccountName, String billingProfileName, BillingProfileInner parameters) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (billingProfileName == null) {
            throw new IllegalArgumentException("Parameter billingProfileName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.beginUpdate(billingAccountName, billingProfileName, this.client.apiVersion(), parameters, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponseWithHeaders<BillingProfileInner, BillingProfilesUpdateHeaders>>>() {
                @Override
                public Observable<ServiceResponseWithHeaders<BillingProfileInner, BillingProfilesUpdateHeaders>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponseWithHeaders<BillingProfileInner, BillingProfilesUpdateHeaders> clientResponse = beginUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponseWithHeaders<BillingProfileInner, BillingProfilesUpdateHeaders> beginUpdateDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<BillingProfileInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<BillingProfileInner>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .registerError(ErrorResponseException.class)
                .buildWithHeaders(response, BillingProfilesUpdateHeaders.class);
    }

}