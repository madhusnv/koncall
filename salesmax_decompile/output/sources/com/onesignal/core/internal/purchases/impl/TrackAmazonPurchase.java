package com.onesignal.core.internal.purchases.impl;

import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.model.Product;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserDataResponse;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.core.internal.application.IApplicationLifecycleHandler;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.operations.IOperationRepo;
import com.onesignal.core.internal.startup.IStartableService;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.operations.PurchaseInfo;
import com.onesignal.user.internal.operations.TrackPurchaseOperation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import p001o.id5;
import p001o.jgg;
import p001o.l75;
import p001o.mge;
import p001o.n64;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class TrackAmazonPurchase implements IStartableService, IApplicationLifecycleHandler {
    public static final Companion Companion = new Companion(null);
    private final IApplicationService _applicationService;
    private final ConfigModelStore _configModelStore;
    private final IdentityModelStore _identityModelStore;
    private final IOperationRepo _operationRepo;
    private boolean canTrack;
    private Field listenerHandlerField;
    private Object listenerHandlerObject;
    private OSPurchasingListener osPurchasingListener;
    private boolean registerListenerOnMainThread;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final boolean canTrack() throws ClassNotFoundException {
            try {
                Class.forName("com.amazon.device.iap.PurchasingListener");
                return true;
            } catch (ClassNotFoundException unused) {
                return false;
            }
        }
    }

    public final class OSPurchasingListener implements PurchasingListener {
        private final ConfigModelStore _configModelStore;
        private final IdentityModelStore _identityModelStore;
        private final IOperationRepo _operationRepo;
        private String currentMarket;
        private RequestId lastRequestId;
        private PurchasingListener orgPurchasingListener;
        final /* synthetic */ TrackAmazonPurchase this$0;

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ProductDataResponse.RequestStatus.values().length];
                iArr[ProductDataResponse.RequestStatus.SUCCESSFUL.ordinal()] = 1;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public OSPurchasingListener(TrackAmazonPurchase trackAmazonPurchase, IOperationRepo iOperationRepo, ConfigModelStore configModelStore, IdentityModelStore identityModelStore) {
            sq8.m48649h(iOperationRepo, "_operationRepo");
            sq8.m48649h(configModelStore, "_configModelStore");
            sq8.m48649h(identityModelStore, "_identityModelStore");
            this.this$0 = trackAmazonPurchase;
            this._operationRepo = iOperationRepo;
            this._configModelStore = configModelStore;
            this._identityModelStore = identityModelStore;
        }

        private final String marketToCurrencyCode(String str) {
            if (str == null) {
                return "";
            }
            int iHashCode = str.hashCode();
            return iHashCode != 2100 ? iHashCode != 2128 ? iHashCode != 2142 ? iHashCode != 2177 ? iHashCode != 2222 ? iHashCode != 2252 ? iHashCode != 2267 ? iHashCode != 2347 ? iHashCode != 2374 ? (iHashCode == 2718 && str.equals("US")) ? "USD" : "" : !str.equals("JP") ? "" : "JPY" : !str.equals("IT") ? "" : "EUR" : !str.equals("GB") ? "" : "GBP" : !str.equals("FR") ? "" : "EUR" : !str.equals("ES") ? "" : "EUR" : !str.equals("DE") ? "" : "EUR" : !str.equals("CA") ? "" : "CDN" : !str.equals("BR") ? "" : "BRL" : !str.equals("AU") ? "" : "AUD";
        }

        public final PurchasingListener getOrgPurchasingListener() {
            return this.orgPurchasingListener;
        }

        public void onProductDataResponse(ProductDataResponse productDataResponse) {
            sq8.m48649h(productDataResponse, "response");
            RequestId requestId = this.lastRequestId;
            if (requestId == null || !sq8.m48644c(String.valueOf(requestId), productDataResponse.getRequestId().toString())) {
                PurchasingListener purchasingListener = this.orgPurchasingListener;
                if (purchasingListener != null) {
                    sq8.m48646e(purchasingListener);
                    purchasingListener.onProductDataResponse(productDataResponse);
                    return;
                }
                return;
            }
            ProductDataResponse.RequestStatus requestStatus = productDataResponse.getRequestStatus();
            if ((requestStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$0[requestStatus.ordinal()]) == 1) {
                ArrayList arrayList = new ArrayList();
                Map productData = productDataResponse.getProductData();
                BigDecimal bigDecimal = new BigDecimal(0);
                Iterator it = productData.keySet().iterator();
                BigDecimal bigDecimalAdd = bigDecimal;
                while (it.hasNext()) {
                    Product product = (Product) productData.get((String) it.next());
                    sq8.m48646e(product);
                    String sku = product.getSku();
                    String strMarketToCurrencyCode = marketToCurrencyCode(this.currentMarket);
                    String price = product.getPrice();
                    sq8.m48648g(price, "priceStr");
                    if (!new mge("^[0-9]").m38995g(price)) {
                        sq8.m48648g(price, "priceStr");
                        price = price.substring(1);
                        sq8.m48648g(price, "this as java.lang.String).substring(startIndex)");
                    }
                    BigDecimal bigDecimal2 = new BigDecimal(price);
                    bigDecimalAdd = bigDecimalAdd.add(bigDecimal2);
                    sq8.m48648g(bigDecimalAdd, "this.add(other)");
                    sq8.m48648g(sku, "sku");
                    arrayList.add(new PurchaseInfo(sku, strMarketToCurrencyCode, bigDecimal2));
                }
                IOperationRepo.DefaultImpls.enqueue$default(this._operationRepo, new TrackPurchaseOperation(this._configModelStore.getModel().getAppId(), this._identityModelStore.getModel().getOnesignalId(), false, bigDecimalAdd, arrayList), false, 2, null);
            }
        }

        public void onPurchaseResponse(PurchaseResponse purchaseResponse) {
            sq8.m48649h(purchaseResponse, "response");
            if (purchaseResponse.getRequestStatus() == PurchaseResponse.RequestStatus.SUCCESSFUL) {
                this.currentMarket = purchaseResponse.getUserData().getMarketplace();
                HashSet hashSet = new HashSet();
                String sku = purchaseResponse.getReceipt().getSku();
                sq8.m48648g(sku, "response.receipt.sku");
                hashSet.add(sku);
                this.lastRequestId = PurchasingService.getProductData(hashSet);
            }
            PurchasingListener purchasingListener = this.orgPurchasingListener;
            if (purchasingListener != null) {
                sq8.m48646e(purchasingListener);
                purchasingListener.onPurchaseResponse(purchaseResponse);
            }
        }

        public void onPurchaseUpdatesResponse(PurchaseUpdatesResponse purchaseUpdatesResponse) {
            sq8.m48649h(purchaseUpdatesResponse, "response");
            PurchasingListener purchasingListener = this.orgPurchasingListener;
            if (purchasingListener != null) {
                sq8.m48646e(purchasingListener);
                purchasingListener.onPurchaseUpdatesResponse(purchaseUpdatesResponse);
            }
        }

        public void onUserDataResponse(UserDataResponse userDataResponse) {
            sq8.m48649h(userDataResponse, "response");
            PurchasingListener purchasingListener = this.orgPurchasingListener;
            if (purchasingListener != null) {
                sq8.m48646e(purchasingListener);
                purchasingListener.onUserDataResponse(userDataResponse);
            }
        }

        public final void setOrgPurchasingListener(PurchasingListener purchasingListener) {
            this.orgPurchasingListener = purchasingListener;
        }
    }

    @l75(m36647c = "com.onesignal.core.internal.purchases.impl.TrackAmazonPurchase$setListener$1", m36648f = "TrackAmazonPurchase.kt", m36649l = {}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.core.internal.purchases.impl.TrackAmazonPurchase$setListener$1 */
    public static final class C116271 extends jgg implements xk7 {
        int label;

        public C116271(n64 n64Var) {
            super(1, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return TrackAmazonPurchase.this.new C116271(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            PurchasingService.registerListener(TrackAmazonPurchase.this._applicationService.getAppContext(), TrackAmazonPurchase.this.osPurchasingListener);
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C116271) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public TrackAmazonPurchase(IApplicationService iApplicationService, IOperationRepo iOperationRepo, ConfigModelStore configModelStore, IdentityModelStore identityModelStore) {
        sq8.m48649h(iApplicationService, "_applicationService");
        sq8.m48649h(iOperationRepo, "_operationRepo");
        sq8.m48649h(configModelStore, "_configModelStore");
        sq8.m48649h(identityModelStore, "_identityModelStore");
        this._applicationService = iApplicationService;
        this._operationRepo = iOperationRepo;
        this._configModelStore = configModelStore;
        this._identityModelStore = identityModelStore;
    }

    private final void logAmazonIAPListenerError(Exception exc) {
        Logging.error("Error adding Amazon IAP listener.", exc);
        exc.printStackTrace();
    }

    private final void setListener() {
        if (this.registerListenerOnMainThread) {
            ThreadUtilsKt.suspendifyOnMain(new C116271(null));
        } else {
            PurchasingService.registerListener(this._applicationService.getAppContext(), this.osPurchasingListener);
        }
    }

    @Override // com.onesignal.core.internal.application.IApplicationLifecycleHandler
    public void onFocus(boolean z) {
    }

    @Override // com.onesignal.core.internal.application.IApplicationLifecycleHandler
    public void onUnfocused() {
        if (this.canTrack) {
            try {
                Field field = this.listenerHandlerField;
                sq8.m48646e(field);
                PurchasingListener purchasingListener = (PurchasingListener) field.get(this.listenerHandlerObject);
                OSPurchasingListener oSPurchasingListener = this.osPurchasingListener;
                if (purchasingListener != oSPurchasingListener) {
                    sq8.m48646e(oSPurchasingListener);
                    oSPurchasingListener.setOrgPurchasingListener(purchasingListener);
                    setListener();
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.onesignal.core.internal.startup.IStartableService
    public void start() throws NoSuchFieldException, ClassNotFoundException, SecurityException {
        if (Companion.canTrack()) {
            try {
                try {
                    Class<?> cls = Class.forName("com.amazon.device.iap.internal.d");
                    try {
                        try {
                            try {
                                this.listenerHandlerObject = cls.getMethod("d", new Class[0]).invoke(null, new Object[0]);
                            } catch (NoSuchMethodException unused) {
                                this.listenerHandlerObject = cls.getMethod("f", new Class[0]).invoke(null, new Object[0]);
                                this.registerListenerOnMainThread = true;
                            }
                        } catch (NullPointerException unused2) {
                            this.listenerHandlerObject = cls.getMethod("e", new Class[0]).invoke(null, new Object[0]);
                            this.registerListenerOnMainThread = true;
                        }
                    } catch (NullPointerException unused3) {
                        this.listenerHandlerObject = cls.getMethod("g", new Class[0]).invoke(null, new Object[0]);
                        this.registerListenerOnMainThread = true;
                    }
                    Field declaredField = cls.getDeclaredField("f");
                    declaredField.setAccessible(true);
                    OSPurchasingListener oSPurchasingListener = new OSPurchasingListener(this, this._operationRepo, this._configModelStore, this._identityModelStore);
                    this.osPurchasingListener = oSPurchasingListener;
                    sq8.m48646e(oSPurchasingListener);
                    oSPurchasingListener.setOrgPurchasingListener((PurchasingListener) declaredField.get(this.listenerHandlerObject));
                    this.listenerHandlerField = declaredField;
                    this.canTrack = true;
                    setListener();
                } catch (NoSuchMethodException e) {
                    logAmazonIAPListenerError(e);
                }
            } catch (ClassCastException e2) {
                logAmazonIAPListenerError(e2);
            } catch (ClassNotFoundException e3) {
                logAmazonIAPListenerError(e3);
            } catch (IllegalAccessException e4) {
                logAmazonIAPListenerError(e4);
            } catch (NoSuchFieldException e5) {
                logAmazonIAPListenerError(e5);
            } catch (InvocationTargetException e6) {
                logAmazonIAPListenerError(e6);
            }
            this._applicationService.addApplicationLifecycleHandler(this);
        }
    }
}
