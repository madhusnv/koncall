package com.amplifyframework.statemachine.codegen.data.serializer;

import java.util.Date;
import p001o.dc9;
import p001o.h76;
import p001o.sq8;
import p001o.uef;
import p001o.vhd;
import p001o.w75;
import p001o.yef;

/* loaded from: classes5.dex */
public final class DateSerializer implements dc9 {
    public static final DateSerializer INSTANCE = new DateSerializer();

    private DateSerializer() {
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return yef.m57704a("Date", vhd.C17585g.f50348a);
    }

    @Override // p001o.bn5
    public Date deserialize(w75 w75Var) {
        sq8.m48649h(w75Var, "decoder");
        return new Date(w75Var.mo17243l());
    }

    @Override // p001o.iff
    public void serialize(h76 h76Var, Date date) {
        sq8.m48649h(h76Var, "encoder");
        sq8.m48649h(date, "value");
        h76Var.mo29880q(date.getTime());
    }
}
