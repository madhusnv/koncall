package p001o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* loaded from: classes2.dex */
public class he2 implements je2 {
    @Override // p001o.je2
    /* renamed from: a */
    public float mo30279a(ie2 ie2Var) {
        return mo30281c(ie2Var) * 2.0f;
    }

    @Override // p001o.je2
    /* renamed from: b */
    public void mo30280b(ie2 ie2Var) {
        mo30291m(ie2Var, mo30284f(ie2Var));
    }

    @Override // p001o.je2
    /* renamed from: c */
    public float mo30281c(ie2 ie2Var) {
        return m30294p(ie2Var).m52035d();
    }

    @Override // p001o.je2
    /* renamed from: d */
    public void mo30282d(ie2 ie2Var, float f) {
        ie2Var.mo4831f().setElevation(f);
    }

    @Override // p001o.je2
    /* renamed from: e */
    public ColorStateList mo30283e(ie2 ie2Var) {
        return m30294p(ie2Var).m52033b();
    }

    @Override // p001o.je2
    /* renamed from: f */
    public float mo30284f(ie2 ie2Var) {
        return m30294p(ie2Var).m52034c();
    }

    @Override // p001o.je2
    /* renamed from: g */
    public float mo30285g(ie2 ie2Var) {
        return mo30281c(ie2Var) * 2.0f;
    }

    @Override // p001o.je2
    /* renamed from: h */
    public void mo30286h(ie2 ie2Var, float f) {
        m30294p(ie2Var).m52039h(f);
    }

    @Override // p001o.je2
    /* renamed from: i */
    public void mo30287i(ie2 ie2Var) {
        mo30291m(ie2Var, mo30284f(ie2Var));
    }

    @Override // p001o.je2
    /* renamed from: j */
    public void mo30288j(ie2 ie2Var, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        ie2Var.mo4827b(new uue(colorStateList, f));
        View viewMo4831f = ie2Var.mo4831f();
        viewMo4831f.setClipToOutline(true);
        viewMo4831f.setElevation(f2);
        mo30291m(ie2Var, f3);
    }

    @Override // p001o.je2
    /* renamed from: k */
    public void mo30289k(ie2 ie2Var) {
        if (!ie2Var.mo4828c()) {
            ie2Var.mo4826a(0, 0, 0, 0);
            return;
        }
        float fMo30284f = mo30284f(ie2Var);
        float fMo30281c = mo30281c(ie2Var);
        int iCeil = (int) Math.ceil(vue.m53455a(fMo30284f, fMo30281c, ie2Var.mo4830e()));
        int iCeil2 = (int) Math.ceil(vue.m53456b(fMo30284f, fMo30281c, ie2Var.mo4830e()));
        ie2Var.mo4826a(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // p001o.je2
    /* renamed from: l */
    public float mo30290l(ie2 ie2Var) {
        return ie2Var.mo4831f().getElevation();
    }

    @Override // p001o.je2
    /* renamed from: m */
    public void mo30291m(ie2 ie2Var, float f) {
        m30294p(ie2Var).m52038g(f, ie2Var.mo4828c(), ie2Var.mo4830e());
        mo30289k(ie2Var);
    }

    @Override // p001o.je2
    /* renamed from: n */
    public void mo30292n() {
    }

    @Override // p001o.je2
    /* renamed from: o */
    public void mo30293o(ie2 ie2Var, ColorStateList colorStateList) {
        m30294p(ie2Var).m52037f(colorStateList);
    }

    /* renamed from: p */
    public final uue m30294p(ie2 ie2Var) {
        return (uue) ie2Var.mo4829d();
    }
}
