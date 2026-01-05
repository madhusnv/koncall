package com.google.mlkit.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_common.zzaq;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import java.util.List;
import p001o.cjb;
import p001o.fmf;
import p001o.ha3;
import p001o.iie;
import p001o.kgb;
import p001o.mgb;
import p001o.qb3;
import p001o.tl6;
import p001o.wij;

@KeepForSdk
/* loaded from: classes6.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        return zzaq.zzi(fmf.f23677b, Component.builder(cjb.class).add(Dependency.required((Class<?>) kgb.class)).factory(new ComponentFactory() { // from class: o.nhj
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return new cjb((kgb) componentContainer.get(kgb.class));
            }
        }).build(), Component.builder(mgb.class).factory(new ComponentFactory() { // from class: o.zhj
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return new mgb();
            }
        }).build(), Component.builder(iie.class).add(Dependency.setOf((Class<?>) iie.C14303a.class)).factory(new ComponentFactory() { // from class: o.eij
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return new iie(componentContainer.setOf(iie.C14303a.class));
            }
        }).build(), Component.builder(tl6.class).add(Dependency.requiredProvider((Class<?>) mgb.class)).factory(new ComponentFactory() { // from class: o.jij
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return new tl6(componentContainer.getProvider(mgb.class));
            }
        }).build(), Component.builder(ha3.class).factory(new ComponentFactory() { // from class: o.nij
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return ha3.m30030a();
            }
        }).build(), Component.builder(qb3.class).add(Dependency.required((Class<?>) ha3.class)).factory(new ComponentFactory() { // from class: o.qij
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return new qb3((ha3) componentContainer.get(ha3.class));
            }
        }).build(), Component.builder(wij.class).add(Dependency.required((Class<?>) kgb.class)).factory(new ComponentFactory() { // from class: o.vij
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return new wij((kgb) componentContainer.get(kgb.class));
            }
        }).build(), Component.intoSetBuilder(iie.C14303a.class).add(Dependency.requiredProvider((Class<?>) wij.class)).factory(new ComponentFactory() { // from class: o.ajj
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return new iie.C14303a(xh4.class, componentContainer.getProvider(wij.class));
            }
        }).build());
    }
}
