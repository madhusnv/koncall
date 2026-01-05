package mh;

import android.graphics.Typeface;
import android.text.TextPaint;
import og.z0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mh.c */
/* loaded from: classes.dex */
public final class C4750c extends z0 {

    /* renamed from: a */
    public final /* synthetic */ TextPaint f23729a;

    /* renamed from: b */
    public final /* synthetic */ z0 f23730b;

    /* renamed from: c */
    public final /* synthetic */ C4751d f23731c;

    public C4750c(C4751d c4751d, TextPaint textPaint, z0 z0Var) {
        this.f23731c = c4751d;
        this.f23729a = textPaint;
        this.f23730b = z0Var;
    }

    @Override // og.z0
    /* renamed from: b */
    public final void mo7029b(int i10) {
        this.f23730b.mo7029b(i10);
    }

    @Override // og.z0
    /* renamed from: c */
    public final void mo7030c(Typeface typeface, boolean z6) {
        this.f23731c.m9661g(this.f23729a, typeface);
        this.f23730b.mo7030c(typeface, z6);
    }
}
