package com.amplifyframework.predictions.aws.models.liveness;

import java.util.List;
import p001o.dc9;
import p001o.dff;
import p001o.fff;
import p001o.id5;
import p001o.ll8;
import p001o.sq8;
import p001o.tbd;
import p001o.to0;

@dff
/* loaded from: classes5.dex */
public final class FreshnessColor {
    private final List<Integer> rGB;
    public static final Companion Companion = new Companion(null);
    private static final dc9[] $childSerializers = {new to0(ll8.f34006a)};

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final dc9 serializer() {
            return FreshnessColor$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FreshnessColor(int i, List list, fff fffVar) {
        if (1 != (i & 1)) {
            tbd.m49692a(i, 1, FreshnessColor$$serializer.INSTANCE.getDescriptor());
        }
        this.rGB = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FreshnessColor copy$default(FreshnessColor freshnessColor, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = freshnessColor.rGB;
        }
        return freshnessColor.copy(list);
    }

    public static /* synthetic */ void getRGB$annotations() {
    }

    public final List<Integer> component1() {
        return this.rGB;
    }

    public final FreshnessColor copy(List<Integer> list) {
        sq8.m48649h(list, "rGB");
        return new FreshnessColor(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FreshnessColor) && sq8.m48644c(this.rGB, ((FreshnessColor) obj).rGB);
    }

    public final List<Integer> getRGB() {
        return this.rGB;
    }

    public int hashCode() {
        return this.rGB.hashCode();
    }

    public String toString() {
        return "FreshnessColor(rGB=" + this.rGB + ")";
    }

    public FreshnessColor(List<Integer> list) {
        sq8.m48649h(list, "rGB");
        this.rGB = list;
    }
}
