package com.amplifyframework.auth.cognito;

import bt.C0773r;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.statemachine.codegen.states.AuthState;
import ds.C1780d;
import ex.InterfaceC2139c;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import q1.C6080h;
import qw.a0;
import s2.C6734c;
import sq.C6908y;
import vr.C7734b;
import wr.C8158n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.amplifyframework.auth.cognito.i */
/* loaded from: classes.dex */
public final /* synthetic */ class C1145i implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f5871a;

    /* renamed from: b */
    public final /* synthetic */ boolean f5872b;

    /* renamed from: c */
    public final /* synthetic */ Object f5873c;

    /* renamed from: d */
    public final /* synthetic */ Object f5874d;

    /* renamed from: e */
    public final /* synthetic */ Object f5875e;

    public /* synthetic */ C1145i(int i10, Object obj, Object obj2, Object obj3, boolean z6) {
        this.f5871a = i10;
        this.f5873c = obj;
        this.f5874d = obj2;
        this.f5872b = z6;
        this.f5875e = obj3;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f5871a) {
            case 0:
                return RealAWSCognitoAuthPlugin.fetchAuthSession$lambda$20((RealAWSCognitoAuthPlugin) this.f5873c, (Consumer) this.f5874d, this.f5872b, (Consumer) this.f5875e, (AuthState) obj);
            default:
                List list = (List) this.f5873c;
                InterfaceC2139c interfaceC2139c = (InterfaceC2139c) this.f5874d;
                String str = (String) this.f5875e;
                C6080h LazyColumn = (C6080h) obj;
                AbstractC4154l.m8923f(LazyColumn, "$this$LazyColumn");
                LazyColumn.m12099p(list.size(), new C8158n(1, new C7734b(7), list), new C6908y(list, 18), new C6734c(new C1780d(6, interfaceC2139c, list), true, -1091073711));
                LazyColumn.m12098n((3 & 1) != 0 ? null : "progressView", null, new C6734c(new C0773r(5, str, interfaceC2139c, this.f5872b), true, -426865285));
                return a0.f30746a;
        }
    }
}
