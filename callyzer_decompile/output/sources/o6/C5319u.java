package o6;

import java.io.Serializable;
import kotlin.jvm.internal.C4168z;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o6.u */
/* loaded from: classes.dex */
public final class C5319u extends AbstractC8193c {

    /* renamed from: a */
    public Object f26162a;

    /* renamed from: b */
    public Object f26163b;

    /* renamed from: c */
    public Serializable f26164c;

    /* renamed from: d */
    public C4168z f26165d;

    /* renamed from: e */
    public boolean f26166e;

    /* renamed from: f */
    public int f26167f;

    /* renamed from: g */
    public /* synthetic */ Object f26168g;

    /* renamed from: h */
    public final /* synthetic */ C5321w f26169h;

    /* renamed from: j */
    public int f26170j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5319u(C5321w c5321w, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f26169h = c5321w;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f26168g = obj;
        this.f26170j |= Integer.MIN_VALUE;
        return C5321w.m10461f(this.f26169h, false, this);
    }
}
