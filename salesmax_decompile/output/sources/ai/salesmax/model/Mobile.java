package ai.salesmax.model;

import java.util.LinkedHashSet;
import java.util.Set;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class Mobile {
    public static final int $stable = 8;
    private Set<Sim> sims;

    /* JADX WARN: Multi-variable type inference failed */
    public Mobile() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Mobile copy$default(Mobile mobile, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            set = mobile.sims;
        }
        return mobile.copy(set);
    }

    public final Set<Sim> component1() {
        return this.sims;
    }

    public final Mobile copy(Set<Sim> set) {
        sq8.m48649h(set, "sims");
        return new Mobile(set);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Mobile) && sq8.m48644c(this.sims, ((Mobile) obj).sims);
    }

    public final Set<Sim> getSims() {
        return this.sims;
    }

    public int hashCode() {
        return this.sims.hashCode();
    }

    public final void setSims(Set<Sim> set) {
        sq8.m48649h(set, "<set-?>");
        this.sims = set;
    }

    public String toString() {
        return "Mobile(sims=" + this.sims + ")";
    }

    public Mobile(Set<Sim> set) {
        sq8.m48649h(set, "sims");
        this.sims = set;
    }

    public /* synthetic */ Mobile(Set set, int i, id5 id5Var) {
        this((i & 1) != 0 ? new LinkedHashSet() : set);
    }
}
