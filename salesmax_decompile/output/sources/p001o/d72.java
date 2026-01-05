package p001o;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import p001o.mq3;
import p001o.rd2;

/* loaded from: classes2.dex */
public final class d72 extends rd2 {

    /* renamed from: I */
    public static final mq3.AbstractC15402a f19164I = mq3.AbstractC15402a.m39507a("camera2.captureRequest.templateType", Integer.TYPE);

    /* renamed from: J */
    public static final mq3.AbstractC15402a f19165J = mq3.AbstractC15402a.m39507a("camera2.cameraCaptureSession.streamUseCase", Long.TYPE);

    /* renamed from: K */
    public static final mq3.AbstractC15402a f19166K = mq3.AbstractC15402a.m39507a("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class);

    /* renamed from: L */
    public static final mq3.AbstractC15402a f19167L = mq3.AbstractC15402a.m39507a("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class);

    /* renamed from: M */
    public static final mq3.AbstractC15402a f19168M = mq3.AbstractC15402a.m39507a("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class);

    /* renamed from: N */
    public static final mq3.AbstractC15402a f19169N = mq3.AbstractC15402a.m39507a("camera2.captureRequest.tag", Object.class);

    /* renamed from: O */
    public static final mq3.AbstractC15402a f19170O = mq3.AbstractC15402a.m39507a("camera2.cameraCaptureSession.physicalCameraId", String.class);

    /* renamed from: o.d72$a */
    public static final class C12801a implements hp6 {

        /* renamed from: a */
        public final qpb f19171a = qpb.a0();

        @Override // p001o.hp6
        /* renamed from: a */
        public vob mo17073a() {
            return this.f19171a;
        }

        /* renamed from: c */
        public d72 m22392c() {
            return new d72(tec.m49792Y(this.f19171a));
        }

        /* renamed from: d */
        public C12801a m22393d(mq3 mq3Var) {
            m22394e(mq3Var, mq3.EnumC15404c.OPTIONAL);
            return this;
        }

        /* renamed from: e */
        public C12801a m22394e(mq3 mq3Var, mq3.EnumC15404c enumC15404c) {
            for (mq3.AbstractC15402a abstractC15402a : mq3Var.mo36956b()) {
                this.f19171a.mo45759C(abstractC15402a, enumC15404c, mq3Var.mo36960f(abstractC15402a));
            }
            return this;
        }

        /* renamed from: f */
        public C12801a m22395f(CaptureRequest.Key key, Object obj) {
            this.f19171a.mo45760N(d72.m22388W(key), obj);
            return this;
        }

        /* renamed from: g */
        public C12801a m22396g(CaptureRequest.Key key, Object obj, mq3.EnumC15404c enumC15404c) {
            this.f19171a.mo45759C(d72.m22388W(key), enumC15404c, obj);
            return this;
        }
    }

    public d72(mq3 mq3Var) {
        super(mq3Var);
    }

    /* renamed from: W */
    public static mq3.AbstractC15402a m22388W(CaptureRequest.Key key) {
        return mq3.AbstractC15402a.m39508b("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }

    /* renamed from: X */
    public rd2 m22389X() {
        return rd2.C16591a.m46538e(getConfig()).m46540d();
    }

    /* renamed from: Y */
    public int m22390Y(int i) {
        return ((Integer) getConfig().mo36958d(f19164I, Integer.valueOf(i))).intValue();
    }

    /* renamed from: Z */
    public CameraDevice.StateCallback m22391Z(CameraDevice.StateCallback stateCallback) {
        return (CameraDevice.StateCallback) getConfig().mo36958d(f19166K, stateCallback);
    }

    public String a0(String str) {
        return (String) getConfig().mo36958d(f19170O, str);
    }

    public CameraCaptureSession.CaptureCallback b0(CameraCaptureSession.CaptureCallback captureCallback) {
        return (CameraCaptureSession.CaptureCallback) getConfig().mo36958d(f19168M, captureCallback);
    }

    public CameraCaptureSession.StateCallback c0(CameraCaptureSession.StateCallback stateCallback) {
        return (CameraCaptureSession.StateCallback) getConfig().mo36958d(f19167L, stateCallback);
    }

    public long d0(long j) {
        return ((Long) getConfig().mo36958d(f19165J, Long.valueOf(j))).longValue();
    }
}
