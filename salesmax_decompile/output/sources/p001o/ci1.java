package p001o;

import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* loaded from: classes5.dex */
public class ci1 implements loe {

    /* renamed from: a */
    public final mi1 f18214a;

    /* renamed from: b */
    public final loe f18215b;

    public ci1(mi1 mi1Var, loe loeVar) {
        this.f18214a = mi1Var;
        this.f18215b = loeVar;
    }

    @Override // p001o.loe
    /* renamed from: a */
    public a76 mo21293a(rec recVar) {
        return this.f18215b.mo21293a(recVar);
    }

    @Override // p001o.i76
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo19552b(zne zneVar, File file, rec recVar) {
        return this.f18215b.mo19552b(new oi1(((BitmapDrawable) zneVar.get()).getBitmap(), this.f18214a), file, recVar);
    }
}
