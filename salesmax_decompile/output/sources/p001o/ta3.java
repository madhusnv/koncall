package p001o;

import android.content.Context;
import android.view.View;
import p001o.cc;

/* loaded from: classes3.dex */
public abstract class ta3 extends db {

    /* renamed from: d */
    public final cc.C12624a f46699d;

    public ta3(Context context, int i) {
        this.f46699d = new cc.C12624a(16, context.getString(i));
    }

    @Override // p001o.db
    /* renamed from: g */
    public void mo5938g(View view, cc ccVar) {
        super.mo5938g(view, ccVar);
        ccVar.m20778b(this.f46699d);
    }
}
