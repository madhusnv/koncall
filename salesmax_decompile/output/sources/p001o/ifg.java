package p001o;

import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import java.io.Closeable;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public interface ifg extends Closeable {

    /* renamed from: o.ifg$a */
    public static abstract class AbstractC14281a {
        /* renamed from: f */
        public static AbstractC14281a m32079f(Size size, Rect rect, v92 v92Var, int i, boolean z) {
            return new q51(size, rect, v92Var, i, z);
        }

        /* renamed from: a */
        public abstract v92 mo32080a();

        /* renamed from: b */
        public abstract Rect mo32081b();

        /* renamed from: c */
        public abstract Size mo32082c();

        /* renamed from: d */
        public abstract boolean mo32083d();

        /* renamed from: e */
        public abstract int mo32084e();
    }

    /* renamed from: o.ifg$b */
    public static abstract class AbstractC14282b {
        /* renamed from: c */
        public static AbstractC14282b m32085c(int i, ifg ifgVar) {
            return new r51(i, ifgVar);
        }

        /* renamed from: a */
        public abstract int mo32086a();

        /* renamed from: b */
        public abstract ifg mo32087b();
    }

    void C1(float[] fArr, float[] fArr2);

    /* renamed from: F */
    void mo32076F(float[] fArr, float[] fArr2, boolean z);

    Surface X1(Executor executor, hu3 hu3Var);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    /* renamed from: j */
    Size mo32077j();

    /* renamed from: l */
    int mo32078l();
}
