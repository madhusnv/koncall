package com.amplifyframework.storage.s3.service;

import ex.InterfaceC2139c;
import g2.ka;
import gb.C2554d;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.amplifyframework.storage.s3.service.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C1246a implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f5924a;

    /* renamed from: b */
    public final /* synthetic */ boolean f5925b;

    public /* synthetic */ C1246a(boolean z6, int i10) {
        this.f5924a = i10;
        this.f5925b = z6;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f5924a) {
            case 0:
                return AWSS3StorageService.getPresignedUrl$lambda$0(this.f5925b, (C2554d) obj);
            default:
                ka it = (ka) obj;
                AbstractC4154l.m8923f(it, "it");
                return Boolean.valueOf(this.f5925b);
        }
    }
}
