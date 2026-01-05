package p001o;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* loaded from: classes5.dex */
public final class twi implements SensorEventListener {

    /* renamed from: b */
    public static final C17247a f47990b = new C17247a(null);

    /* renamed from: a */
    public InterfaceC17248b f47991a;

    /* renamed from: o.twi$a */
    public static final class C17247a {
        public C17247a() {
        }

        public /* synthetic */ C17247a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: o.twi$b */
    public interface InterfaceC17248b {
        /* renamed from: a */
        void mo48288a();
    }

    /* renamed from: a */
    public final void m50735a(InterfaceC17248b interfaceC17248b) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            this.f47991a = interfaceC17248b;
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            sq8.m48649h(sensor, "sensor");
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            sq8.m48649h(sensorEvent, "event");
            InterfaceC17248b interfaceC17248b = this.f47991a;
            if (interfaceC17248b != null) {
                float[] fArr = sensorEvent.values;
                double d = fArr[0] / 9.80665f;
                double d2 = fArr[1] / 9.80665f;
                double d3 = fArr[2] / 9.80665f;
                if (Math.sqrt((d * d) + (d2 * d2) + (d3 * d3)) > 2.3d) {
                    interfaceC17248b.mo48288a();
                }
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }
}
