package p001o;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.google.android.gms.common.api.Api;

/* loaded from: classes2.dex */
public class dt5 {

    /* renamed from: a */
    public final Context f20491a;

    /* renamed from: b */
    public final et5 f20492b;

    /* renamed from: c */
    public final InterfaceC13027b f20493c;

    /* renamed from: d */
    public final InterfaceC13026a f20494d;

    /* renamed from: e */
    public VelocityTracker f20495e;

    /* renamed from: f */
    public float f20496f;

    /* renamed from: g */
    public int f20497g;

    /* renamed from: h */
    public int f20498h;

    /* renamed from: i */
    public int f20499i;

    /* renamed from: j */
    public final int[] f20500j;

    /* renamed from: o.dt5$a */
    public interface InterfaceC13026a {
        /* renamed from: a */
        float mo21745a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i);
    }

    /* renamed from: o.dt5$b */
    public interface InterfaceC13027b {
        /* renamed from: a */
        void mo19710a(Context context, int[] iArr, MotionEvent motionEvent, int i);
    }

    public dt5(Context context, et5 et5Var) {
        this(context, et5Var, new InterfaceC13027b() { // from class: o.bt5
            @Override // p001o.dt5.InterfaceC13027b
            /* renamed from: a */
            public final void mo19710a(Context context2, int[] iArr, MotionEvent motionEvent, int i) {
                dt5.m23777c(context2, iArr, motionEvent, i);
            }
        }, new InterfaceC13026a() { // from class: o.ct5
            @Override // p001o.dt5.InterfaceC13026a
            /* renamed from: a */
            public final float mo21745a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i) {
                return dt5.m23778f(velocityTracker, motionEvent, i);
            }
        });
    }

    /* renamed from: c */
    public static void m23777c(Context context, int[] iArr, MotionEvent motionEvent, int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = cwi.m21950i(context, viewConfiguration, motionEvent.getDeviceId(), i, motionEvent.getSource());
        iArr[1] = cwi.m21949h(context, viewConfiguration, motionEvent.getDeviceId(), i, motionEvent.getSource());
    }

    /* renamed from: f */
    public static float m23778f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i) {
        nsi.m41099a(velocityTracker, motionEvent);
        nsi.m41100b(velocityTracker, 1000);
        return nsi.m41102d(velocityTracker, i);
    }

    /* renamed from: d */
    public final boolean m23779d(MotionEvent motionEvent, int i) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f20498h == source && this.f20499i == deviceId && this.f20497g == i) {
            return false;
        }
        this.f20493c.mo19710a(this.f20491a, this.f20500j, motionEvent, i);
        this.f20498h = source;
        this.f20499i = deviceId;
        this.f20497g = i;
        return true;
    }

    /* renamed from: e */
    public final float m23780e(MotionEvent motionEvent, int i) {
        if (this.f20495e == null) {
            this.f20495e = VelocityTracker.obtain();
        }
        return this.f20494d.mo21745a(this.f20495e, motionEvent, i);
    }

    /* renamed from: g */
    public void m23781g(MotionEvent motionEvent, int i) {
        boolean zM23779d = m23779d(motionEvent, i);
        if (this.f20500j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f20495e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f20495e = null;
                return;
            }
            return;
        }
        float fM23780e = m23780e(motionEvent, i) * this.f20492b.mo5942b();
        float fSignum = Math.signum(fM23780e);
        if (zM23779d || (fSignum != Math.signum(this.f20496f) && fSignum != 0.0f)) {
            this.f20492b.mo5943c();
        }
        float fAbs = Math.abs(fM23780e);
        int[] iArr = this.f20500j;
        if (fAbs < iArr[0]) {
            return;
        }
        float fMax = Math.max(-r6, Math.min(fM23780e, iArr[1]));
        this.f20496f = this.f20492b.mo5941a(fMax) ? fMax : 0.0f;
    }

    public dt5(Context context, et5 et5Var, InterfaceC13027b interfaceC13027b, InterfaceC13026a interfaceC13026a) {
        this.f20497g = -1;
        this.f20498h = -1;
        this.f20499i = -1;
        this.f20500j = new int[]{Api.BaseClientBuilder.API_PRIORITY_OTHER, 0};
        this.f20491a = context;
        this.f20492b = et5Var;
        this.f20493c = interfaceC13027b;
        this.f20494d = interfaceC13026a;
    }
}
