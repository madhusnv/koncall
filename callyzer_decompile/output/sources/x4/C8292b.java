package x4;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: x4.b */
/* loaded from: classes.dex */
public final class C8292b extends Throwable {

    /* renamed from: a */
    public final /* synthetic */ int f39823a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8292b(String str, int i10) {
        super(str);
        this.f39823a = i10;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        int i10 = this.f39823a;
        synchronized (this) {
            switch (i10) {
            }
            return this;
        }
    }
}
