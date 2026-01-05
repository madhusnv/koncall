package ht;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import ex.InterfaceC2139c;
import java.util.ArrayList;
import java.util.List;
import jt.C3854c;
import jt.C3856e;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;
import p007h.C2749a;
import qw.a0;
import rw.C6668r;
import tx.c0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ht.d */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3029d implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f16336a;

    /* renamed from: b */
    public final /* synthetic */ C3856e f16337b;

    /* renamed from: c */
    public final /* synthetic */ Context f16338c;

    public /* synthetic */ C3029d(C3856e c3856e, Context context, int i10) {
        this.f16336a = i10;
        this.f16337b = c3856e;
        this.f16338c = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [rw.r] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0, types: [u2.q] */
    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        ?? M10833h;
        switch (this.f16336a) {
            case 0:
                C2749a result = (C2749a) obj;
                AbstractC4154l.m8923f(result, "result");
                Intent intent = result.f15294b;
                if ((intent != null ? intent.getClipData() : null) != null) {
                    ClipData clipData = intent.getClipData();
                    AbstractC4154l.m8920c(clipData);
                    int itemCount = clipData.getItemCount();
                    M10833h = new ArrayList(itemCount);
                    for (int i10 = 0; i10 < itemCount; i10++) {
                        ClipData clipData2 = intent.getClipData();
                        AbstractC4154l.m8920c(clipData2);
                        M10833h.add(clipData2.getItemAt(i10).getUri());
                    }
                } else if ((intent != null ? intent.getData() : null) != null) {
                    Uri data = intent.getData();
                    AbstractC4154l.m8920c(data);
                    M10833h = pe.m10833h(data);
                } else {
                    M10833h = C6668r.f31943a;
                }
                if (!M10833h.isEmpty()) {
                    Context context = this.f16338c;
                    AbstractC4154l.m8923f(context, "context");
                    C3856e c3856e = this.f16337b;
                    c3856e.f19855k.addAll(M10833h);
                    c0.m13502y(c3856e.f19850f, null, null, new C3854c(c3856e, context, null, 2), 3);
                }
                break;
            case 1:
                List uris = (List) obj;
                AbstractC4154l.m8923f(uris, "uris");
                if (!uris.isEmpty()) {
                    Context context2 = this.f16338c;
                    AbstractC4154l.m8923f(context2, "context");
                    C3856e c3856e2 = this.f16337b;
                    c3856e2.f19855k.addAll(uris);
                    c0.m13502y(c3856e2.f19850f, null, null, new C3854c(c3856e2, context2, null, 2), 3);
                }
                break;
            default:
                Uri uri = (Uri) obj;
                AbstractC4154l.m8923f(uri, "uri");
                Context context3 = this.f16338c;
                AbstractC4154l.m8923f(context3, "context");
                C3856e c3856e3 = this.f16337b;
                c3856e3.f19855k.remove(uri);
                c0.m13502y(c3856e3.f19850f, null, null, new C3854c(c3856e3, context3, null, 2), 3);
                break;
        }
        return a0.f30746a;
    }
}
