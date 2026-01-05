package p001o;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import p001o.e9j;
import p001o.r9j;

/* loaded from: classes3.dex */
public class tj8 extends e9j.AbstractC13133b {

    /* renamed from: c */
    public final View f47286c;

    /* renamed from: d */
    public int f47287d;

    /* renamed from: e */
    public int f47288e;

    /* renamed from: f */
    public final int[] f47289f;

    public tj8(View view) {
        super(0);
        this.f47289f = new int[2];
        this.f47286c = view;
    }

    @Override // p001o.e9j.AbstractC13133b
    /* renamed from: b */
    public void mo24621b(e9j e9jVar) {
        this.f47286c.setTranslationY(0.0f);
    }

    @Override // p001o.e9j.AbstractC13133b
    /* renamed from: c */
    public void mo24622c(e9j e9jVar) {
        this.f47286c.getLocationOnScreen(this.f47289f);
        this.f47287d = this.f47289f[1];
    }

    @Override // p001o.e9j.AbstractC13133b
    /* renamed from: d */
    public r9j mo24623d(r9j r9jVar, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((e9j) it.next()).m24614c() & r9j.C16576m.m46446b()) != 0) {
                this.f47286c.setTranslationY(gh0.m28649c(this.f47288e, 0, r0.m24613b()));
                break;
            }
        }
        return r9jVar;
    }

    @Override // p001o.e9j.AbstractC13133b
    /* renamed from: e */
    public e9j.C13132a mo24624e(e9j e9jVar, e9j.C13132a c13132a) {
        this.f47286c.getLocationOnScreen(this.f47289f);
        int i = this.f47287d - this.f47289f[1];
        this.f47288e = i;
        this.f47286c.setTranslationY(i);
        return c13132a;
    }
}
