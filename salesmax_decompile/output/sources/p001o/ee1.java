package p001o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.InterfaceC11061b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class ee1 implements InterfaceC11061b {

    /* renamed from: a */
    public final Context f21469a;

    /* renamed from: b */
    public final ExtendedFloatingActionButton f21470b;

    /* renamed from: c */
    public final ArrayList f21471c = new ArrayList();

    /* renamed from: d */
    public final mh0 f21472d;

    /* renamed from: e */
    public smb f21473e;

    /* renamed from: f */
    public smb f21474f;

    /* renamed from: o.ee1$a */
    public class C13163a extends Property {
        public C13163a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
            return Float.valueOf(gh0.m28647a(0.0f, 1.0f, (Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton.L0.getColorForState(extendedFloatingActionButton.getDrawableState(), ee1.this.f21470b.L0.getDefaultColor()))));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f) {
            int colorForState = extendedFloatingActionButton.L0.getColorForState(extendedFloatingActionButton.getDrawableState(), ee1.this.f21470b.L0.getDefaultColor());
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(Color.argb((int) (gh0.m28647a(0.0f, Color.alpha(colorForState) / 255.0f, f.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
            if (f.floatValue() == 1.0f) {
                extendedFloatingActionButton.m14607J(extendedFloatingActionButton.L0);
            } else {
                extendedFloatingActionButton.m14607J(colorStateListValueOf);
            }
        }
    }

    public ee1(ExtendedFloatingActionButton extendedFloatingActionButton, mh0 mh0Var) {
        this.f21470b = extendedFloatingActionButton;
        this.f21469a = extendedFloatingActionButton.getContext();
        this.f21472d = mh0Var;
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC11061b
    /* renamed from: a */
    public void mo14626a() {
        this.f21472d.m39041b();
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC11061b
    /* renamed from: c */
    public smb mo14721c() {
        return this.f21474f;
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC11061b
    /* renamed from: e */
    public void mo14632e() {
        this.f21472d.m39041b();
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC11061b
    /* renamed from: g */
    public final void mo14722g(smb smbVar) {
        this.f21474f = smbVar;
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC11061b
    /* renamed from: h */
    public AnimatorSet mo14630h() {
        return m24836l(m24837m());
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC11061b
    /* renamed from: i */
    public final List mo14723i() {
        return this.f21471c;
    }

    /* renamed from: l */
    public AnimatorSet m24836l(smb smbVar) {
        ArrayList arrayList = new ArrayList();
        if (smbVar.m48554j("opacity")) {
            arrayList.add(smbVar.m48550f("opacity", this.f21470b, View.ALPHA));
        }
        if (smbVar.m48554j("scale")) {
            arrayList.add(smbVar.m48550f("scale", this.f21470b, View.SCALE_Y));
            arrayList.add(smbVar.m48550f("scale", this.f21470b, View.SCALE_X));
        }
        if (smbVar.m48554j("width")) {
            arrayList.add(smbVar.m48550f("width", this.f21470b, ExtendedFloatingActionButton.Q0));
        }
        if (smbVar.m48554j("height")) {
            arrayList.add(smbVar.m48550f("height", this.f21470b, ExtendedFloatingActionButton.R0));
        }
        if (smbVar.m48554j("paddingStart")) {
            arrayList.add(smbVar.m48550f("paddingStart", this.f21470b, ExtendedFloatingActionButton.S0));
        }
        if (smbVar.m48554j("paddingEnd")) {
            arrayList.add(smbVar.m48550f("paddingEnd", this.f21470b, ExtendedFloatingActionButton.T0));
        }
        if (smbVar.m48554j("labelOpacity")) {
            arrayList.add(smbVar.m48550f("labelOpacity", this.f21470b, new C13163a(Float.class, "LABEL_OPACITY_PROPERTY")));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        lh0.m37166a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: m */
    public final smb m24837m() {
        smb smbVar = this.f21474f;
        if (smbVar != null) {
            return smbVar;
        }
        if (this.f21473e == null) {
            this.f21473e = smb.m48547d(this.f21469a, mo14629f());
        }
        return (smb) fgd.m26663g(this.f21473e);
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC11061b
    public void onAnimationStart(Animator animator) {
        this.f21472d.m39042c(animator);
    }
}
