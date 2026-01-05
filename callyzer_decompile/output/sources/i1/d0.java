package i1;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import com.skydoves.balloon.internals.DefinitionKt;
import s4.C6756l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a */
    public final Context f16819a;

    /* renamed from: b */
    public final int f16820b;

    /* renamed from: c */
    public long f16821c = 0;

    /* renamed from: d */
    public EdgeEffect f16822d;

    /* renamed from: e */
    public EdgeEffect f16823e;

    /* renamed from: f */
    public EdgeEffect f16824f;

    /* renamed from: g */
    public EdgeEffect f16825g;

    /* renamed from: h */
    public EdgeEffect f16826h;

    /* renamed from: i */
    public EdgeEffect f16827i;

    /* renamed from: j */
    public EdgeEffect f16828j;

    /* renamed from: k */
    public EdgeEffect f16829k;

    public d0(Context context, int i10) {
        this.f16819a = context;
        this.f16820b = i10;
    }

    /* renamed from: f */
    public static boolean m7484f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    /* renamed from: g */
    public static boolean m7485g(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((Build.VERSION.SDK_INT >= 31 ? AbstractC3131j.m7513c(edgeEffect) : 0.0f) == DefinitionKt.NO_Float_VALUE);
    }

    /* renamed from: a */
    public final EdgeEffect m7486a(k1.x0 x0Var) {
        int i10 = Build.VERSION.SDK_INT;
        Context context = this.f16819a;
        EdgeEffect edgeEffectM7511a = i10 >= 31 ? AbstractC3131j.m7511a(context) : new h0(context);
        edgeEffectM7511a.setColor(this.f16820b);
        if (!C6756l.m12948a(this.f16821c, 0L)) {
            if (x0Var == k1.x0.Vertical) {
                long j6 = this.f16821c;
                edgeEffectM7511a.setSize((int) (j6 >> 32), (int) (j6 & 4294967295L));
                return edgeEffectM7511a;
            }
            long j10 = this.f16821c;
            edgeEffectM7511a.setSize((int) (j10 & 4294967295L), (int) (j10 >> 32));
        }
        return edgeEffectM7511a;
    }

    /* renamed from: b */
    public final EdgeEffect m7487b() {
        EdgeEffect edgeEffect = this.f16823e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM7486a = m7486a(k1.x0.Vertical);
        this.f16823e = edgeEffectM7486a;
        return edgeEffectM7486a;
    }

    /* renamed from: c */
    public final EdgeEffect m7488c() {
        EdgeEffect edgeEffect = this.f16824f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM7486a = m7486a(k1.x0.Horizontal);
        this.f16824f = edgeEffectM7486a;
        return edgeEffectM7486a;
    }

    /* renamed from: d */
    public final EdgeEffect m7489d() {
        EdgeEffect edgeEffect = this.f16825g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM7486a = m7486a(k1.x0.Horizontal);
        this.f16825g = edgeEffectM7486a;
        return edgeEffectM7486a;
    }

    /* renamed from: e */
    public final EdgeEffect m7490e() {
        EdgeEffect edgeEffect = this.f16822d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM7486a = m7486a(k1.x0.Vertical);
        this.f16822d = edgeEffectM7486a;
        return edgeEffectM7486a;
    }
}
