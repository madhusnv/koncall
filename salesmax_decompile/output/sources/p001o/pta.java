package p001o;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;
import org.objectweb.asm.Opcodes;

/* loaded from: classes3.dex */
public abstract class pta {

    /* renamed from: a */
    public final TimeInterpolator f40540a = new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);

    /* renamed from: b */
    public final View f40541b;

    /* renamed from: c */
    public final int f40542c;

    /* renamed from: d */
    public final int f40543d;

    /* renamed from: e */
    public final int f40544e;

    /* renamed from: f */
    public l91 f40545f;

    public pta(View view) {
        this.f40541b = view;
        Context context = view.getContext();
        this.f40542c = umb.m51785f(context, x5e.motionDurationMedium2, 300);
        this.f40543d = umb.m51785f(context, x5e.motionDurationShort3, Opcodes.FCMPG);
        this.f40544e = umb.m51785f(context, x5e.motionDurationShort2, 100);
    }

    /* renamed from: a */
    public float m44146a(float f) {
        return this.f40540a.getInterpolation(f);
    }

    /* renamed from: b */
    public l91 m44147b() {
        l91 l91Var = this.f40545f;
        this.f40545f = null;
        return l91Var;
    }

    /* renamed from: c */
    public l91 m44148c() {
        l91 l91Var = this.f40545f;
        this.f40545f = null;
        return l91Var;
    }

    /* renamed from: d */
    public void m44149d(l91 l91Var) {
        this.f40545f = l91Var;
    }

    /* renamed from: e */
    public l91 m44150e(l91 l91Var) {
        l91 l91Var2 = this.f40545f;
        this.f40545f = l91Var;
        return l91Var2;
    }
}
