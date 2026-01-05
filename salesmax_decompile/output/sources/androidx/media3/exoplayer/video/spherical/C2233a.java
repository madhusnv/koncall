package androidx.media3.exoplayer.video.spherical;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import org.objectweb.asm.Opcodes;
import p001o.wj7;

/* renamed from: androidx.media3.exoplayer.video.spherical.a */
/* loaded from: classes2.dex */
public final class C2233a implements SensorEventListener {

    /* renamed from: a */
    public final float[] f8619a = new float[16];

    /* renamed from: b */
    public final float[] f8620b = new float[16];

    /* renamed from: c */
    public final float[] f8621c = new float[16];

    /* renamed from: d */
    public final float[] f8622d = new float[3];

    /* renamed from: e */
    public final Display f8623e;

    /* renamed from: f */
    public final a[] f8624f;

    /* renamed from: g */
    public boolean f8625g;

    /* renamed from: androidx.media3.exoplayer.video.spherical.a$a */
    public interface a {
        /* renamed from: a */
        void mo7524a(float[] fArr, float f);
    }

    public C2233a(Display display, a... aVarArr) {
        this.f8623e = display;
        this.f8624f = aVarArr;
    }

    /* renamed from: e */
    public static void m7528e(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    /* renamed from: a */
    public final float m7529a(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, Opcodes.LXOR, this.f8620b);
        SensorManager.getOrientation(this.f8620b, this.f8622d);
        return this.f8622d[2];
    }

    /* renamed from: b */
    public final void m7530b(float[] fArr, float f) {
        for (a aVar : this.f8624f) {
            aVar.mo7524a(fArr, f);
        }
    }

    /* renamed from: c */
    public final void m7531c(float[] fArr) {
        if (!this.f8625g) {
            wj7.m54622a(this.f8621c, fArr);
            this.f8625g = true;
        }
        float[] fArr2 = this.f8620b;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.f8620b, 0, this.f8621c, 0);
    }

    /* renamed from: d */
    public final void m7532d(float[] fArr, int i) {
        if (i != 0) {
            int i2 = Opcodes.LOR;
            int i3 = 1;
            if (i == 1) {
                i3 = 129;
                i2 = 2;
            } else if (i == 2) {
                i3 = 130;
            } else {
                if (i != 3) {
                    throw new IllegalStateException();
                }
                i2 = 130;
            }
            float[] fArr2 = this.f8620b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f8620b, i2, i3, fArr);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f8619a, sensorEvent.values);
        m7532d(this.f8619a, this.f8623e.getRotation());
        float fM7529a = m7529a(this.f8619a);
        m7528e(this.f8619a);
        m7531c(this.f8619a);
        m7530b(this.f8619a, fM7529a);
    }
}
