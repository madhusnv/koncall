package com.amplifyframework.auth.cognito;

import com.amplifyframework.core.Consumer;
import com.amplifyframework.statemachine.StateChangeListenerToken;
import com.amplifyframework.statemachine.codegen.states.AuthState;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4164v;
import kotlin.jvm.internal.C4168z;
import l7.C4409i;
import q7.C6138e;
import qw.a0;
import rw.C6661k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.amplifyframework.auth.cognito.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C1136c implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f5835a;

    /* renamed from: b */
    public final /* synthetic */ boolean f5836b;

    /* renamed from: c */
    public final /* synthetic */ Object f5837c;

    /* renamed from: d */
    public final /* synthetic */ Object f5838d;

    /* renamed from: e */
    public final /* synthetic */ Object f5839e;

    /* renamed from: f */
    public final /* synthetic */ Object f5840f;

    public /* synthetic */ C1136c(int i10, Object obj, Object obj2, Object obj3, Object obj4, boolean z6) {
        this.f5835a = i10;
        this.f5837c = obj;
        this.f5838d = obj2;
        this.f5839e = obj3;
        this.f5836b = z6;
        this.f5840f = obj4;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f5835a) {
            case 0:
                return RealAWSCognitoAuthPlugin._signOut$lambda$27((RealAWSCognitoAuthPlugin) this.f5837c, (StateChangeListenerToken) this.f5838d, (Consumer) this.f5839e, this.f5836b, (C4168z) this.f5840f, (AuthState) obj);
            default:
                C4164v c4164v = (C4164v) this.f5837c;
                C4164v c4164v2 = (C4164v) this.f5838d;
                C6138e c6138e = (C6138e) this.f5839e;
                C6661k c6661k = (C6661k) this.f5840f;
                C4409i entry = (C4409i) obj;
                AbstractC4154l.m8923f(entry, "entry");
                c4164v.f21160a = true;
                c4164v2.f21160a = true;
                c6138e.m12183r(entry, this.f5836b, c6661k);
                return a0.f30746a;
        }
    }
}
