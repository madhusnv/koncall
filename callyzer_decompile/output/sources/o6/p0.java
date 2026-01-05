package o6;

import dy.C1855c;
import java.io.FileInputStream;
import java.nio.channels.FileLock;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class p0 extends AbstractC8193c {

    /* renamed from: a */
    public C1855c f26113a;

    /* renamed from: b */
    public FileInputStream f26114b;

    /* renamed from: c */
    public FileLock f26115c;

    /* renamed from: d */
    public boolean f26116d;

    /* renamed from: e */
    public /* synthetic */ Object f26117e;

    /* renamed from: f */
    public final /* synthetic */ q0 f26118f;

    /* renamed from: g */
    public int f26119g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(q0 q0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f26118f = q0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f26117e = obj;
        this.f26119g |= Integer.MIN_VALUE;
        return this.f26118f.mo10442c(null, this);
    }
}
