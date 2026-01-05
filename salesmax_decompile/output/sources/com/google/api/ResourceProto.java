package com.google.api;

import p001o.fbj;
import p001o.qp6;
import p001o.tm5;
import p001o.um5;
import p001o.vm5;
import p001o.wn7;

/* loaded from: classes3.dex */
public final class ResourceProto {
    public static final int RESOURCE_DEFINITION_FIELD_NUMBER = 1053;
    public static final int RESOURCE_FIELD_NUMBER = 1053;
    public static final int RESOURCE_REFERENCE_FIELD_NUMBER = 1055;
    public static final wn7.C17939f resource;
    public static final wn7.C17939f resourceDefinition;
    public static final wn7.C17939f resourceReference;

    static {
        tm5 tm5VarM50182i = tm5.m50182i();
        ResourceReference defaultInstance = ResourceReference.getDefaultInstance();
        ResourceReference defaultInstance2 = ResourceReference.getDefaultInstance();
        fbj.EnumC13396b enumC13396b = fbj.EnumC13396b.MESSAGE;
        resourceReference = wn7.newSingularGeneratedExtension(tm5VarM50182i, defaultInstance, defaultInstance2, null, RESOURCE_REFERENCE_FIELD_NUMBER, enumC13396b, ResourceReference.class);
        resourceDefinition = wn7.newRepeatedGeneratedExtension(um5.m51776i(), ResourceDescriptor.getDefaultInstance(), null, 1053, enumC13396b, false, ResourceDescriptor.class);
        resource = wn7.newSingularGeneratedExtension(vm5.m52964i(), ResourceDescriptor.getDefaultInstance(), ResourceDescriptor.getDefaultInstance(), null, 1053, enumC13396b, ResourceDescriptor.class);
    }

    private ResourceProto() {
    }

    public static void registerAllExtensions(qp6 qp6Var) {
        qp6Var.m45751a(resourceReference);
        qp6Var.m45751a(resourceDefinition);
        qp6Var.m45751a(resource);
    }
}
