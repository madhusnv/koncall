package p001o;

/* loaded from: classes.dex */
public final class mpi {

    /* renamed from: a */
    public Boolean f35852a;

    /* renamed from: b */
    public String f35853b;

    public mpi(Boolean bool, String str) {
        this.f35852a = bool;
        this.f35853b = str;
    }

    /* renamed from: a */
    public final void m39500a(String str) {
        this.f35853b = str;
    }

    /* renamed from: b */
    public final void m39501b(Boolean bool) {
        this.f35852a = bool;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mpi)) {
            return false;
        }
        mpi mpiVar = (mpi) obj;
        return sq8.m48644c(this.f35852a, mpiVar.f35852a) && sq8.m48644c(this.f35853b, mpiVar.f35853b);
    }

    public int hashCode() {
        Boolean bool = this.f35852a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.f35853b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "UserProfileStatus(success=" + this.f35852a + ", message=" + this.f35853b + ")";
    }
}
