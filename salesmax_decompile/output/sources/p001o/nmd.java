package p001o;

/* loaded from: classes.dex */
public final class nmd extends RuntimeException {

    /* renamed from: a */
    public mpi f37046a;

    public nmd(mpi mpiVar, Throwable th) {
        this.f37046a = mpiVar;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString();
    }

    public /* synthetic */ nmd(mpi mpiVar, Throwable th, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : mpiVar, (i & 2) != 0 ? null : th);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public nmd(mpi mpiVar) {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        sq8.m48649h(mpiVar, "userProfileStatus");
    }
}
