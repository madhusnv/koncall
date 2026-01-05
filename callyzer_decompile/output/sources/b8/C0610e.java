package b8;

import java.io.Serializable;
import kotlin.jvm.internal.C4168z;
import uw.InterfaceC7564h;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b8.e */
/* loaded from: classes.dex */
public final class C0610e extends AbstractC8193c {

    /* renamed from: a */
    public Object f4004a;

    /* renamed from: b */
    public Serializable f4005b;

    /* renamed from: c */
    public C0618m f4006c;

    /* renamed from: d */
    public C4168z f4007d;

    /* renamed from: e */
    public InterfaceC7564h f4008e;

    /* renamed from: f */
    public C4168z f4009f;

    /* renamed from: g */
    public boolean f4010g;

    /* renamed from: h */
    public /* synthetic */ Object f4011h;

    /* renamed from: j */
    public final /* synthetic */ C0611f f4012j;

    /* renamed from: k */
    public int f4013k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0610e(C0611f c0611f, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f4012j = c0611f;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f4011h = obj;
        this.f4013k |= Integer.MIN_VALUE;
        return this.f4012j.mo1767s(false, null, this);
    }
}
