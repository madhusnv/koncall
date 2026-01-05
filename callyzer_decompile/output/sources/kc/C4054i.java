package kc;

import b00.C0531p;
import kotlin.jvm.internal.AbstractC4154l;
import tb.C7105p;
import tb.EnumC7093d;
import vc.InterfaceC7700c;
import vc.InterfaceC7703f;
import zj.C8986c;
import zk.C8989c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kc.i */
/* loaded from: classes.dex */
public final class C4054i implements InterfaceC4050e {

    /* renamed from: a */
    public final /* synthetic */ int f20899a;

    /* renamed from: b */
    public final String f20900b;

    /* renamed from: c */
    public final InterfaceC4053h f20901c;

    public C4054i(String str, C7105p awsSigner) {
        this.f20899a = 1;
        AbstractC4154l.m8923f(awsSigner, "awsSigner");
        C0531p c0531p = new C0531p(1);
        c0531p.f3657d = awsSigner;
        c0531p.f3658e = str;
        this.f20900b = "aws.auth#sigv4";
        this.f20901c = new C8989c(27, c0531p);
    }

    @Override // kc.InterfaceC4050e
    /* renamed from: a */
    public final InterfaceC4053h mo8833a() {
        switch (this.f20899a) {
            case 0:
                return (C8989c) this.f20901c;
            case 1:
                return (C8989c) this.f20901c;
            default:
                return (C8986c) this.f20901c;
        }
    }

    @Override // kc.InterfaceC4050e
    /* renamed from: b */
    public final InterfaceC7700c mo8834b(InterfaceC7703f identityProviderConfig) {
        switch (this.f20899a) {
            case 0:
                AbstractC4154l.m8923f(identityProviderConfig, "identityProviderConfig");
                break;
            case 1:
                AbstractC4154l.m8923f(identityProviderConfig, "identityProviderConfig");
                break;
            default:
                AbstractC4154l.m8923f(identityProviderConfig, "identityProviderConfig");
                break;
        }
        return identityProviderConfig.mo1857S(mo8835c());
    }

    @Override // kc.InterfaceC4050e
    /* renamed from: c */
    public final String mo8835c() {
        switch (this.f20899a) {
        }
        return this.f20900b;
    }

    public C4054i(C7105p awsSigner, int i10) {
        this.f20899a = i10;
        switch (i10) {
            case 2:
                AbstractC4154l.m8923f(awsSigner, "awsSigner");
                C0531p c0531p = new C0531p(1);
                c0531p.f3657d = awsSigner;
                c0531p.f3658e = "s3";
                EnumC7093d enumC7093d = EnumC7093d.SIGV4;
                AbstractC4154l.m8923f(enumC7093d, "<set-?>");
                c0531p.f3660g = enumC7093d;
                C8989c c8989c = new C8989c(27, c0531p);
                this.f20900b = "aws.auth#sigv4s3express";
                this.f20901c = new C8986c(28, c8989c);
                break;
            default:
                AbstractC4154l.m8923f(awsSigner, "awsSigner");
                C0531p c0531p2 = new C0531p(1);
                c0531p2.f3657d = awsSigner;
                c0531p2.f3658e = "s3";
                EnumC7093d enumC7093d2 = EnumC7093d.SIGV4_ASYMMETRIC;
                AbstractC4154l.m8923f(enumC7093d2, "<set-?>");
                c0531p2.f3660g = enumC7093d2;
                this.f20900b = "aws.auth#sigv4a";
                this.f20901c = new C8989c(27, c0531p2);
                break;
        }
    }
}
