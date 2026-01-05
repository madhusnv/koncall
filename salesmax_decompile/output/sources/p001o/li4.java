package p001o;

import android.graphics.drawable.Drawable;

/* loaded from: classes5.dex */
public abstract class li4 implements pjg {

    /* renamed from: a */
    public final int f33875a;

    /* renamed from: b */
    public final int f33876b;

    /* renamed from: c */
    public wle f33877c;

    public li4() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // p001o.pjg
    /* renamed from: a */
    public final wle mo36380a() {
        return this.f33877c;
    }

    @Override // p001o.pjg
    /* renamed from: b */
    public final void mo36381b(kvf kvfVar) {
    }

    @Override // p001o.pjg
    /* renamed from: d */
    public final void mo36382d(wle wleVar) {
        this.f33877c = wleVar;
    }

    @Override // p001o.pjg
    /* renamed from: e */
    public final void mo36383e(kvf kvfVar) {
        kvfVar.mo36260e(this.f33875a, this.f33876b);
    }

    @Override // p001o.pjg
    /* renamed from: g */
    public void mo36384g(Drawable drawable) {
    }

    @Override // p001o.pjg
    /* renamed from: j */
    public void mo37266j(Drawable drawable) {
    }

    @Override // p001o.vca
    public void onDestroy() {
    }

    @Override // p001o.vca
    public void onStart() {
    }

    @Override // p001o.vca
    public void onStop() {
    }

    public li4(int i, int i2) {
        if (uqi.m51938s(i, i2)) {
            this.f33875a = i;
            this.f33876b = i2;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i + " and height: " + i2);
    }
}
