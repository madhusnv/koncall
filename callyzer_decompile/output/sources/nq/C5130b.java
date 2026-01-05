package nq;

import android.net.Uri;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import oq.C5436a;
import pq.C5997b;
import qq.C6276b;
import qw.a0;
import wx.m1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nq.b */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5130b implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f25127a;

    /* renamed from: b */
    public final /* synthetic */ C6276b f25128b;

    public /* synthetic */ C5130b(C6276b c6276b, int i10) {
        this.f25127a = i10;
        this.f25128b = c6276b;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        Object value;
        switch (this.f25127a) {
            case 0:
                this.f25128b.m12279e(new C5436a(((Integer) obj).intValue()));
                break;
            case 1:
                this.f25128b.m12279e(new C5436a(((Integer) obj).intValue()));
                break;
            default:
                Uri uri = (Uri) obj;
                AbstractC4154l.m8923f(uri, "uri");
                m1 m1Var = this.f25128b.f30492f;
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, C5997b.m12030a((C5997b) value, uri, 0, null, null, null, 62)));
                return a0.f30746a;
        }
        return a0.f30746a;
    }
}
