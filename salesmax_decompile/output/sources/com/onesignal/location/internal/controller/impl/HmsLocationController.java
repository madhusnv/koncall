package com.onesignal.location.internal.controller.impl;

import android.location.Location;
import android.os.Handler;
import android.os.HandlerThread;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationResult;
import com.huawei.hms.location.LocationServices;
import com.onesignal.common.events.EventProducer;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.common.threading.Waiter;
import com.onesignal.common.threading.WaiterWithValue;
import com.onesignal.core.internal.application.IApplicationLifecycleHandler;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.location.internal.controller.ILocationController;
import com.onesignal.location.internal.controller.ILocationUpdatedHandler;
import java.io.Closeable;
import java.io.IOException;
import org.objectweb.asm.Opcodes;
import p001o.cz7;
import p001o.dge;
import p001o.eu5;
import p001o.gge;
import p001o.h84;
import p001o.jgg;
import p001o.l75;
import p001o.ml1;
import p001o.n64;
import p001o.nl7;
import p001o.nqb;
import p001o.o64;
import p001o.pm1;
import p001o.sq8;
import p001o.tqb;
import p001o.uq8;
import p001o.wre;
import p001o.xk7;
import p001o.y3i;
import p001o.z74;

/* loaded from: classes6.dex */
public final class HmsLocationController implements ILocationController {
    private final IApplicationService _applicationService;
    private final EventProducer<ILocationUpdatedHandler> event;
    private FusedLocationProviderClient hmsFusedLocationClient;
    private Location lastLocation;
    private final LocationHandlerThread locationHandlerThread;
    private LocationUpdateListener locationUpdateListener;
    private final nqb startStopMutex;

    public static final class LocationHandlerThread extends HandlerThread {
        private Handler mHandler;

        public LocationHandlerThread() {
            super("OSH_LocationHandlerThread");
            start();
            this.mHandler = new Handler(getLooper());
        }

        public final Handler getMHandler() {
            return this.mHandler;
        }

        public final void setMHandler(Handler handler) {
            sq8.m48649h(handler, "<set-?>");
            this.mHandler = handler;
        }
    }

    public static final class LocationUpdateListener extends LocationCallback implements IApplicationLifecycleHandler, Closeable {
        private final IApplicationService _applicationService;
        private final HmsLocationController _parent;
        private boolean hasExistingRequest;
        private final FusedLocationProviderClient huaweiFusedLocationProviderClient;

        public LocationUpdateListener(HmsLocationController hmsLocationController, IApplicationService iApplicationService, FusedLocationProviderClient fusedLocationProviderClient) throws IOException {
            sq8.m48649h(hmsLocationController, "_parent");
            sq8.m48649h(iApplicationService, "_applicationService");
            sq8.m48649h(fusedLocationProviderClient, "huaweiFusedLocationProviderClient");
            this._parent = hmsLocationController;
            this._applicationService = iApplicationService;
            this.huaweiFusedLocationProviderClient = fusedLocationProviderClient;
            iApplicationService.addApplicationLifecycleHandler(this);
            refreshRequest();
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v2 ??, still in use, count: 1, list:
              (r2v2 ?? I:lombok.launch.PatchFixesHider$Transform) from 0x002c: INVOKE (r0v8 ?? I:void) = (r2v2 ?? I:lombok.launch.PatchFixesHider$Transform), (r0v7 ?? I:java.lang.ClassLoader) VIRTUAL call: lombok.launch.PatchFixesHider.Transform.init(java.lang.ClassLoader):void A[MD:(java.lang.ClassLoader):void (m)] (LINE:45)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
            	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
            	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
            */
        private final void refreshRequest() throws java.io.IOException {
            /*
                r5 = this;
                boolean r0 = r5.hasExistingRequest
                if (r0 == 0) goto Lc
                com.huawei.hms.location.FusedLocationProviderClient r0 = r5.huaweiFusedLocationProviderClient
                r1 = r5
                com.huawei.hms.location.LocationCallback r1 = (com.huawei.hms.location.LocationCallback) r1
                r0.removeLocationUpdates(r1)
            Lc:
                com.onesignal.core.internal.application.IApplicationService r0 = r5._applicationService
                boolean r0 = r0.isInForeground()
                if (r0 == 0) goto L18
                r0 = 270000(0x41eb0, double:1.333977E-318)
                goto L1b
            L18:
                r0 = 570000(0x8b290, double:2.816174E-318)
            L1b:
                com.huawei.hms.location.LocationRequest r2 = com.huawei.hms.location.LocationRequest.create()
                com.huawei.hms.location.LocationRequest r2 = r2.setFastestInterval(r0)
                void r2 = r2.<init>()
                double r0 = (double) r0
                r3 = 4609434218613702656(0x3ff8000000000000, double:1.5)
                double r0 = r0 * r3
                long r0 = (long) r0
                void r0 = r2.init(r0)
                r1 = 102(0x66, float:1.43E-43)
                void r0 = r0.transform(r1, r0)
                java.lang.String r1 = "HMSLocationController Huawei LocationServices requestLocationUpdates!"
                r2 = 2
                r3 = 0
                com.onesignal.debug.internal.logging.Logging.debug$default(r1, r3, r2, r3)
                com.huawei.hms.location.FusedLocationProviderClient r1 = r5.huaweiFusedLocationProviderClient
                r2 = r5
                com.huawei.hms.location.LocationCallback r2 = (com.huawei.hms.location.LocationCallback) r2
                com.onesignal.location.internal.controller.impl.HmsLocationController r3 = r5._parent
                com.onesignal.location.internal.controller.impl.HmsLocationController$LocationHandlerThread r3 = com.onesignal.location.internal.controller.impl.HmsLocationController.access$getLocationHandlerThread$p(r3)
                android.os.Looper r3 = r3.getLooper()
                r1.requestLocationUpdates(r0, r2, r3)
                r0 = 1
                r5.hasExistingRequest = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.location.internal.controller.impl.HmsLocationController.LocationUpdateListener.refreshRequest():void");
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this._applicationService.removeApplicationLifecycleHandler(this);
            if (this.hasExistingRequest) {
                this.huaweiFusedLocationProviderClient.removeLocationUpdates(this);
            }
        }

        @Override // com.onesignal.core.internal.application.IApplicationLifecycleHandler
        public void onFocus(boolean z) throws IOException {
            Logging.log(LogLevel.DEBUG, "LocationUpdateListener.onFocus()");
            refreshRequest();
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [android.location.Location, void] */
        public void onLocationResult(LocationResult locationResult) {
            sq8.m48649h(locationResult, "locationResult");
            Logging.debug$default("HMSLocationController onLocationResult: " + locationResult, null, 2, null);
            HmsLocationController hmsLocationController = this._parent;
            hmsLocationController.lastLocation = locationResult.transform_swapped(hmsLocationController, hmsLocationController);
        }

        @Override // com.onesignal.core.internal.application.IApplicationLifecycleHandler
        public void onUnfocused() throws IOException {
            Logging.log(LogLevel.DEBUG, "LocationUpdateListener.onUnfocused()");
            refreshRequest();
        }
    }

    @l75(m36647c = "com.onesignal.location.internal.controller.impl.HmsLocationController$getLastLocation$1", m36648f = "HmsLocationController.kt", m36649l = {Opcodes.F2I}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.location.internal.controller.impl.HmsLocationController$getLastLocation$1 */
    public static final class C117161 extends jgg implements xk7 {
        final /* synthetic */ FusedLocationProviderClient $locationClient;
        final /* synthetic */ gge $retVal;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117161(FusedLocationProviderClient fusedLocationProviderClient, gge ggeVar, n64 n64Var) {
            super(1, n64Var);
            this.$locationClient = fusedLocationProviderClient;
            this.$retVal = ggeVar;
        }

        /* renamed from: invokeSuspend$lambda-0, reason: not valid java name */
        private static final void m68764invokeSuspend$lambda0(gge ggeVar, gge ggeVar2, Location location) throws Exception {
            Logging.warn$default("Huawei LocationServices getLastLocation returned location: " + location, null, 2, null);
            if (location == null) {
                ((Waiter) ggeVar.f25106a).wake();
            } else {
                ggeVar2.f25106a = location;
                ((Waiter) ggeVar.f25106a).wake();
            }
        }

        /* renamed from: invokeSuspend$lambda-1, reason: not valid java name */
        private static final void m68765invokeSuspend$lambda1(gge ggeVar, Exception exc) throws Exception {
            Logging.error("Huawei LocationServices getLastLocation failed!", exc);
            ((Waiter) ggeVar.f25106a).wake();
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return new C117161(this.$locationClient, this.$retVal, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                final gge ggeVar = new gge();
                ggeVar.f25106a = new Waiter();
                Task lastLocation = this.$locationClient.getLastLocation();
                final gge ggeVar2 = this.$retVal;
                lastLocation.addOnSuccessListener(new OnSuccessListener() { // from class: o.bz7
                }).addOnFailureListener(new cz7(ggeVar));
                Waiter waiter = (Waiter) ggeVar.f25106a;
                this.label = 1;
                if (waiter.waitForWake(this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C117161) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.location.internal.controller.impl.HmsLocationController", m36648f = "HmsLocationController.kt", m36649l = {46}, m36650m = "start")
    /* renamed from: com.onesignal.location.internal.controller.impl.HmsLocationController$start$1 */
    public static final class C117171 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C117171(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HmsLocationController.this.start(this);
        }
    }

    @l75(m36647c = "com.onesignal.location.internal.controller.impl.HmsLocationController$start$2", m36648f = "HmsLocationController.kt", m36649l = {229, Opcodes.FASTORE}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.location.internal.controller.impl.HmsLocationController$start$2 */
    public static final class C117182 extends jgg implements nl7 {
        final /* synthetic */ gge $self;
        final /* synthetic */ dge $wasSuccessful;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117182(dge dgeVar, gge ggeVar, n64 n64Var) {
            super(2, n64Var);
            this.$wasSuccessful = dgeVar;
            this.$self = ggeVar;
        }

        /* renamed from: invokeSuspend$lambda-2$lambda-0, reason: not valid java name */
        private static final void m68766invokeSuspend$lambda2$lambda0(gge ggeVar, HmsLocationController hmsLocationController, Location location) {
            Logging.warn$default("Huawei LocationServices getLastLocation returned location: " + location, null, 2, null);
            if (location == null) {
                ((WaiterWithValue) ggeVar.f25106a).wake(Boolean.FALSE);
            } else {
                hmsLocationController.lastLocation = location;
                ((WaiterWithValue) ggeVar.f25106a).wake(Boolean.TRUE);
            }
        }

        /* renamed from: invokeSuspend$lambda-2$lambda-1, reason: not valid java name */
        private static final void m68767invokeSuspend$lambda2$lambda1(gge ggeVar, Exception exc) {
            Logging.error("Huawei LocationServices getLastLocation failed!", exc);
            ((WaiterWithValue) ggeVar.f25106a).wake(Boolean.FALSE);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return HmsLocationController.this.new C117182(this.$wasSuccessful, this.$self, n64Var);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x00a1 A[Catch: all -> 0x012c, TryCatch #1 {all -> 0x012c, blocks: (B:18:0x006b, B:20:0x0071, B:24:0x009b, B:26:0x00a1, B:27:0x00af, B:23:0x0082), top: B:44:0x006b, inners: #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00af A[Catch: all -> 0x012c, TRY_LEAVE, TryCatch #1 {all -> 0x012c, blocks: (B:18:0x006b, B:20:0x0071, B:24:0x009b, B:26:0x00a1, B:27:0x00af, B:23:0x0082), top: B:44:0x006b, inners: #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ff A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:7:0x0023, B:31:0x00f3, B:33:0x00ff, B:35:0x0123), top: B:42:0x0023 }] */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            nqb nqbVar;
            dge dgeVar;
            final HmsLocationController hmsLocationController;
            gge ggeVar;
            nqb nqbVar2;
            Throwable th;
            dge dgeVar2;
            HmsLocationController hmsLocationController2;
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            try {
                if (i == 0) {
                    wre.m54934b(obj);
                    nqbVar = HmsLocationController.this.startStopMutex;
                    HmsLocationController hmsLocationController3 = HmsLocationController.this;
                    dge dgeVar3 = this.$wasSuccessful;
                    gge ggeVar2 = this.$self;
                    this.L$0 = nqbVar;
                    this.L$1 = hmsLocationController3;
                    this.L$2 = dgeVar3;
                    this.L$3 = ggeVar2;
                    this.label = 1;
                    if (nqbVar.mo40922b(null, this) == objM51918f) {
                        return objM51918f;
                    }
                    dgeVar = dgeVar3;
                    hmsLocationController = hmsLocationController3;
                    ggeVar = ggeVar2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        dgeVar2 = (dge) this.L$4;
                        ggeVar = (gge) this.L$3;
                        dgeVar = (dge) this.L$2;
                        hmsLocationController2 = (HmsLocationController) this.L$1;
                        nqbVar2 = (nqb) this.L$0;
                        try {
                            wre.m54934b(obj);
                            dgeVar2.f19803a = ((Boolean) obj).booleanValue();
                            if (dgeVar.f19803a) {
                                hmsLocationController2.event.fire(new HmsLocationController$start$2$1$4(hmsLocationController2));
                                HmsLocationController hmsLocationController4 = (HmsLocationController) ggeVar.f25106a;
                                IApplicationService iApplicationService = hmsLocationController2._applicationService;
                                FusedLocationProviderClient fusedLocationProviderClient = hmsLocationController2.hmsFusedLocationClient;
                                sq8.m48646e(fusedLocationProviderClient);
                                hmsLocationController2.locationUpdateListener = new LocationUpdateListener(hmsLocationController4, iApplicationService, fusedLocationProviderClient);
                            }
                            nqbVar = nqbVar2;
                            nqbVar2 = nqbVar;
                            y3i y3iVar = y3i.f54824a;
                            nqbVar2.mo40923c(null);
                            return y3i.f54824a;
                        } catch (Throwable th2) {
                            th = th2;
                            nqbVar2.mo40923c(null);
                            throw th;
                        }
                    }
                    ggeVar = (gge) this.L$3;
                    dgeVar = (dge) this.L$2;
                    hmsLocationController = (HmsLocationController) this.L$1;
                    nqb nqbVar3 = (nqb) this.L$0;
                    wre.m54934b(obj);
                    nqbVar = nqbVar3;
                }
                if (hmsLocationController.hmsFusedLocationClient == null) {
                    try {
                        hmsLocationController.hmsFusedLocationClient = LocationServices.getFusedLocationProviderClient(hmsLocationController._applicationService.getAppContext());
                        if (hmsLocationController.lastLocation == null) {
                            hmsLocationController.event.fire(new HmsLocationController$start$2$1$1(hmsLocationController));
                        } else {
                            final gge ggeVar3 = new gge();
                            ggeVar3.f25106a = new WaiterWithValue();
                            FusedLocationProviderClient fusedLocationProviderClient2 = hmsLocationController.hmsFusedLocationClient;
                            sq8.m48646e(fusedLocationProviderClient2);
                            fusedLocationProviderClient2.getLastLocation().addOnSuccessListener(new OnSuccessListener() { // from class: o.dz7
                            }).addOnFailureListener(new cz7(ggeVar3));
                            WaiterWithValue waiterWithValue = (WaiterWithValue) ggeVar3.f25106a;
                            this.L$0 = nqbVar;
                            this.L$1 = hmsLocationController;
                            this.L$2 = dgeVar;
                            this.L$3 = ggeVar;
                            this.L$4 = dgeVar;
                            this.label = 2;
                            Object objWaitForWake = waiterWithValue.waitForWake(this);
                            if (objWaitForWake == objM51918f) {
                                return objM51918f;
                            }
                            dgeVar2 = dgeVar;
                            HmsLocationController hmsLocationController5 = hmsLocationController;
                            nqbVar2 = nqbVar;
                            obj = objWaitForWake;
                            hmsLocationController2 = hmsLocationController5;
                            dgeVar2.f19803a = ((Boolean) obj).booleanValue();
                            if (dgeVar.f19803a) {
                            }
                            nqbVar = nqbVar2;
                        }
                    } catch (Exception e) {
                        Logging.error$default("Huawei LocationServices getFusedLocationProviderClient failed! " + e, null, 2, null);
                        dgeVar.f19803a = false;
                    }
                } else if (hmsLocationController.lastLocation == null) {
                }
                nqbVar2 = nqbVar;
                y3i y3iVar2 = y3i.f54824a;
                nqbVar2.mo40923c(null);
                return y3i.f54824a;
            } catch (Throwable th3) {
                nqbVar2 = nqbVar;
                th = th3;
                nqbVar2.mo40923c(null);
                throw th;
            }
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C117182) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.location.internal.controller.impl.HmsLocationController", m36648f = "HmsLocationController.kt", m36649l = {229}, m36650m = "stop")
    /* renamed from: com.onesignal.location.internal.controller.impl.HmsLocationController$stop$1 */
    public static final class C117191 extends o64 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C117191(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HmsLocationController.this.stop(this);
        }
    }

    public HmsLocationController(IApplicationService iApplicationService) {
        sq8.m48649h(iApplicationService, "_applicationService");
        this._applicationService = iApplicationService;
        this.locationHandlerThread = new LocationHandlerThread();
        this.startStopMutex = tqb.m50340b(false, 1, null);
        this.event = new EventProducer<>();
    }

    public static final /* synthetic */ LocationHandlerThread access$getLocationHandlerThread$p(HmsLocationController hmsLocationController) {
        return hmsLocationController.locationHandlerThread;
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public boolean getHasSubscribers() {
        return this.event.getHasSubscribers();
    }

    @Override // com.onesignal.location.internal.controller.ILocationController
    public Location getLastLocation() {
        FusedLocationProviderClient fusedLocationProviderClient = this.hmsFusedLocationClient;
        if (fusedLocationProviderClient == null) {
            return null;
        }
        gge ggeVar = new gge();
        ThreadUtilsKt.suspendifyOnThread$default(0, new C117161(fusedLocationProviderClient, ggeVar, null), 1, null);
        return (Location) ggeVar.f25106a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.location.internal.controller.ILocationController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object start(n64 n64Var) {
        C117171 c117171;
        dge dgeVar;
        if (n64Var instanceof C117171) {
            c117171 = (C117171) n64Var;
            int i = c117171.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c117171.label = i - Integer.MIN_VALUE;
            } else {
                c117171 = new C117171(n64Var);
            }
        }
        Object obj = c117171.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c117171.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            gge ggeVar = new gge();
            ggeVar.f25106a = this;
            dge dgeVar2 = new dge();
            z74 z74VarM25611b = eu5.m25611b();
            C117182 c117182 = new C117182(dgeVar2, ggeVar, null);
            c117171.L$0 = dgeVar2;
            c117171.label = 1;
            if (pm1.m43867g(z74VarM25611b, c117182, c117171) == objM51918f) {
                return objM51918f;
            }
            dgeVar = dgeVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dgeVar = (dge) c117171.L$0;
            wre.m54934b(obj);
        }
        return ml1.m39301a(dgeVar.f19803a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.location.internal.controller.ILocationController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object stop(n64 n64Var) {
        C117191 c117191;
        HmsLocationController hmsLocationController;
        nqb nqbVar;
        if (n64Var instanceof C117191) {
            c117191 = (C117191) n64Var;
            int i = c117191.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c117191.label = i - Integer.MIN_VALUE;
            } else {
                c117191 = new C117191(n64Var);
            }
        }
        Object obj = c117191.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c117191.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            nqb nqbVar2 = this.startStopMutex;
            c117191.L$0 = this;
            c117191.L$1 = nqbVar2;
            c117191.label = 1;
            if (nqbVar2.mo40922b(null, c117191) == objM51918f) {
                return objM51918f;
            }
            hmsLocationController = this;
            nqbVar = nqbVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nqbVar = (nqb) c117191.L$1;
            hmsLocationController = (HmsLocationController) c117191.L$0;
            wre.m54934b(obj);
        }
        try {
            LocationUpdateListener locationUpdateListener = hmsLocationController.locationUpdateListener;
            if (locationUpdateListener != null) {
                sq8.m48646e(locationUpdateListener);
                locationUpdateListener.close();
                hmsLocationController.locationUpdateListener = null;
            }
            if (hmsLocationController.hmsFusedLocationClient != null) {
                hmsLocationController.hmsFusedLocationClient = null;
            }
            hmsLocationController.lastLocation = null;
            y3i y3iVar = y3i.f54824a;
            nqbVar.mo40923c(null);
            return y3i.f54824a;
        } catch (Throwable th) {
            nqbVar.mo40923c(null);
            throw th;
        }
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void subscribe(ILocationUpdatedHandler iLocationUpdatedHandler) {
        sq8.m48649h(iLocationUpdatedHandler, "handler");
        this.event.subscribe(iLocationUpdatedHandler);
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void unsubscribe(ILocationUpdatedHandler iLocationUpdatedHandler) {
        sq8.m48649h(iLocationUpdatedHandler, "handler");
        this.event.unsubscribe(iLocationUpdatedHandler);
    }
}
