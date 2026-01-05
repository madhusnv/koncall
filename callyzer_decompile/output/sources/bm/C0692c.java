package bm;

import au.C0442f;
import b3.a0;
import c3.C0847b;
import c3.C0850e;
import com.sun.mail.util.AbstractC1452a;
import cv.C1517m;
import ex.InterfaceC2139c;
import hq.C3009n;
import k2.w0;
import kotlin.jvm.internal.AbstractC4154l;
import og.ze;
import or.C5442e;
import org.bouncycastle.iana.AEADAlgorithm;
import t3.InterfaceC7033t;
import y4.C8541b;
import y4.C8545f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bm.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C0692c implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f4330a;

    /* renamed from: b */
    public final /* synthetic */ w0 f4331b;

    public /* synthetic */ C0692c(w0 w0Var, int i10) {
        this.f4330a = i10;
        this.f4331b = w0Var;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f4330a) {
            case 0:
                String search = (String) obj;
                AbstractC4154l.m8923f(search, "search");
                this.f4331b.setValue(search);
                break;
            case 1:
                InterfaceC7033t layoutCoordinates = (InterfaceC7033t) obj;
                AbstractC4154l.m8923f(layoutCoordinates, "layoutCoordinates");
                this.f4331b.setValue(new C0850e(ze.m11098d(layoutCoordinates.mo13307v())));
                break;
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.f4331b.setValue(bool);
                break;
            case 3:
                C8545f c8545f = (C8545f) obj;
                C8541b c8541bM4574u = AbstractC1452a.m4574u(c8545f, "$this$ConstraintSet", "searchView");
                C8541b c8541b = new C8541b("listView");
                C8541b c8541b2 = new C8541b("progressView");
                C8541b c8541b3 = new C8541b("emptyView");
                c8545f.m15811b(c8541bM4574u, new C1517m(28));
                c8545f.m15811b(c8541b, new C0442f(c8541bM4574u, 5));
                c8545f.m15811b(c8541b3, new C0442f(c8541bM4574u, 6));
                c8545f.m15811b(c8541b2, new C3009n(0, c8541bM4574u, this.f4331b));
                break;
            case 4:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                this.f4331b.setValue(bool2);
                break;
            case 5:
                InterfaceC7033t layoutCoordinates2 = (InterfaceC7033t) obj;
                AbstractC4154l.m8923f(layoutCoordinates2, "layoutCoordinates");
                this.f4331b.setValue(new C0850e(ze.m11098d(layoutCoordinates2.mo13307v())));
                break;
            case 6:
                InterfaceC7033t layoutCoordinates3 = (InterfaceC7033t) obj;
                AbstractC4154l.m8923f(layoutCoordinates3, "layoutCoordinates");
                this.f4331b.setValue(new C0850e(ze.m11098d(layoutCoordinates3.mo13307v())));
                break;
            case 7:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                this.f4331b.setValue(bool3);
                break;
            case 8:
                InterfaceC7033t layoutCoordinates4 = (InterfaceC7033t) obj;
                AbstractC4154l.m8923f(layoutCoordinates4, "layoutCoordinates");
                this.f4331b.setValue(new C0850e(ze.m11098d(layoutCoordinates4.mo13307v())));
                break;
            case 9:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                this.f4331b.setValue(bool4);
                break;
            case 10:
                a0 it = (a0) obj;
                AbstractC4154l.m8923f(it, "it");
                this.f4331b.setValue(Boolean.valueOf(it.isFocused()));
                break;
            case 11:
                this.f4331b.setValue(new C0847b(((C0847b) obj).f5352a));
                break;
            case 12:
                this.f4331b.setValue((String) obj);
                break;
            case 13:
                C5442e it2 = (C5442e) obj;
                AbstractC4154l.m8923f(it2, "it");
                this.f4331b.setValue(it2);
                break;
            case 14:
                this.f4331b.setValue(Boolean.FALSE);
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                a0 it3 = (a0) obj;
                AbstractC4154l.m8923f(it3, "it");
                this.f4331b.setValue(Boolean.valueOf(it3.isFocused()));
                break;
            case 16:
                ((Boolean) obj).getClass();
                this.f4331b.setValue(Boolean.FALSE);
                break;
            case 17:
                ((Boolean) obj).getClass();
                this.f4331b.setValue(Boolean.valueOf(!((Boolean) r7.getValue()).booleanValue()));
                break;
            case 18:
                a0 focusState = (a0) obj;
                AbstractC4154l.m8923f(focusState, "focusState");
                this.f4331b.setValue(Boolean.valueOf(focusState.isFocused()));
                break;
            case 19:
                InterfaceC7033t layoutCoordinates5 = (InterfaceC7033t) obj;
                AbstractC4154l.m8923f(layoutCoordinates5, "layoutCoordinates");
                this.f4331b.setValue(new C0850e(ze.m11098d(layoutCoordinates5.mo13307v())));
                break;
            case 20:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                this.f4331b.setValue(bool5);
                break;
            case 21:
                InterfaceC7033t coordinates = (InterfaceC7033t) obj;
                AbstractC4154l.m8923f(coordinates, "coordinates");
                this.f4331b.setValue(new C0850e(ze.m11098d(coordinates.mo13307v())));
                break;
            default:
                InterfaceC7033t coordinates2 = (InterfaceC7033t) obj;
                AbstractC4154l.m8923f(coordinates2, "coordinates");
                this.f4331b.setValue(new C0850e(ze.m11098d(coordinates2.mo13307v())));
                break;
        }
        return qw.a0.f30746a;
    }
}
