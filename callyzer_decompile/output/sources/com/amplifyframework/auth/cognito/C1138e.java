package com.amplifyframework.auth.cognito;

import android.app.Activity;
import aq.C0400c;
import aq.C0408k;
import aq.C0409l;
import com.amplifyframework.auth.AuthProvider;
import com.amplifyframework.auth.cognito.options.FederateToIdentityPoolOptions;
import com.amplifyframework.auth.options.AuthSignInOptions;
import com.amplifyframework.auth.options.AuthWebUISignInOptions;
import com.amplifyframework.core.Consumer;
import er.AbstractC2101a;
import er.C2117q;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import ex.InterfaceC2142f;
import fr.C2369a;
import hq.C3012q;
import i1.C3135n;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import l7.a0;
import op.AbstractC5432a;
import q1.C6080h;
import qp.C6270g;
import qw.InterfaceC6355e;
import s2.C6734c;
import tq.EnumC7204p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.amplifyframework.auth.cognito.e */
/* loaded from: classes.dex */
public final /* synthetic */ class C1138e implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f5848a;

    /* renamed from: b */
    public final /* synthetic */ Object f5849b;

    /* renamed from: c */
    public final /* synthetic */ Object f5850c;

    /* renamed from: d */
    public final /* synthetic */ Object f5851d;

    /* renamed from: e */
    public final /* synthetic */ Object f5852e;

    /* renamed from: f */
    public final /* synthetic */ Object f5853f;

    /* renamed from: g */
    public final /* synthetic */ Object f5854g;

    public /* synthetic */ C1138e(AuthSignInOptions authSignInOptions, RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, Consumer consumer, String str, String str2, Consumer consumer2) {
        this.f5848a = 1;
        this.f5852e = authSignInOptions;
        this.f5849b = realAWSCognitoAuthPlugin;
        this.f5850c = consumer;
        this.f5853f = str;
        this.f5854g = str2;
        this.f5851d = consumer2;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f5848a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                List list = (List) this.f5850c;
                C2369a c2369a = (C2369a) this.f5851d;
                InterfaceC2141e interfaceC2141e = (InterfaceC2141e) this.f5849b;
                InterfaceC2142f interfaceC2142f = (InterfaceC2142f) this.f5852e;
                InterfaceC2139c interfaceC2139c = (InterfaceC2139c) this.f5853f;
                a0 a0Var = (a0) this.f5854g;
                C6080h LazyColumn = (C6080h) obj;
                AbstractC4154l.m8923f(LazyColumn, "$this$LazyColumn");
                LazyColumn.m12099p(list.size(), new C0408k(6, new C0400c(23), list), new C0409l(list, 5), new C6734c(new C2117q(list, interfaceC2141e, interfaceC2142f, interfaceC2139c, a0Var), true, -1091073711));
                if (c2369a.f10774d) {
                    LazyColumn.m12098n((3 & 1) != 0 ? null : "progressView", null, AbstractC2101a.f9853a);
                }
                break;
            default:
                List list2 = (List) this.f5850c;
                C6270g c6270g = (C6270g) this.f5851d;
                EnumC7204p enumC7204p = (EnumC7204p) this.f5849b;
                InterfaceC2139c interfaceC2139c2 = (InterfaceC2139c) this.f5852e;
                InterfaceC2141e interfaceC2141e2 = (InterfaceC2141e) this.f5853f;
                InterfaceC2139c interfaceC2139c3 = (InterfaceC2139c) this.f5854g;
                C6080h LazyColumn2 = (C6080h) obj;
                AbstractC4154l.m8923f(LazyColumn2, "$this$LazyColumn");
                LazyColumn2.m12099p(list2.size(), new C3135n(22, new C3012q(15), list2), new C0409l(list2, 20), new C6734c(new C2117q(list2, enumC7204p, interfaceC2139c2, interfaceC2141e2, interfaceC2139c3), true, -1091073711));
                if (c6270g.f30419h) {
                    LazyColumn2.m12098n((3 & 1) != 0 ? null : "progressView", null, AbstractC5432a.f27329a);
                }
                break;
        }
        return qw.a0.f30746a;
    }

    public /* synthetic */ C1138e(Consumer consumer, RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, Activity activity, AuthWebUISignInOptions authWebUISignInOptions, Consumer consumer2, AuthProvider authProvider) {
        this.f5848a = 0;
        this.f5850c = consumer;
        this.f5849b = realAWSCognitoAuthPlugin;
        this.f5852e = activity;
        this.f5853f = authWebUISignInOptions;
        this.f5851d = consumer2;
        this.f5854g = authProvider;
    }

    public /* synthetic */ C1138e(Consumer consumer, RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, String str, AuthProvider authProvider, FederateToIdentityPoolOptions federateToIdentityPoolOptions, Consumer consumer2) {
        this.f5848a = 2;
        this.f5850c = consumer;
        this.f5849b = realAWSCognitoAuthPlugin;
        this.f5852e = str;
        this.f5854g = authProvider;
        this.f5853f = federateToIdentityPoolOptions;
        this.f5851d = consumer2;
    }

    public /* synthetic */ C1138e(List list, Object obj, Object obj2, InterfaceC6355e interfaceC6355e, InterfaceC6355e interfaceC6355e2, Object obj3, int i10) {
        this.f5848a = i10;
        this.f5850c = list;
        this.f5851d = obj;
        this.f5849b = obj2;
        this.f5852e = interfaceC6355e;
        this.f5853f = interfaceC6355e2;
        this.f5854g = obj3;
    }
}
