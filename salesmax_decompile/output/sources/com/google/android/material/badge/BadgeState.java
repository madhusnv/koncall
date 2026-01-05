package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.firebase.perf.util.Constants;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;
import p001o.bkh;
import p001o.ebe;
import p001o.mgh;
import p001o.pae;
import p001o.s9e;
import p001o.v9e;
import p001o.x6e;
import p001o.xy5;
import p001o.yya;

/* loaded from: classes3.dex */
public final class BadgeState {

    /* renamed from: a */
    public final State f12027a;

    /* renamed from: b */
    public final State f12028b;

    /* renamed from: c */
    public final float f12029c;

    /* renamed from: d */
    public final float f12030d;

    /* renamed from: e */
    public final float f12031e;

    /* renamed from: f */
    public final float f12032f;

    /* renamed from: g */
    public final float f12033g;

    /* renamed from: h */
    public final float f12034h;

    /* renamed from: i */
    public final int f12035i;

    /* renamed from: j */
    public final int f12036j;

    /* renamed from: k */
    public int f12037k;

    /* renamed from: l */
    public int f12038l;

    public BadgeState(Context context, int i, int i2, int i3, State state) throws XmlPullParserException, Resources.NotFoundException, IOException {
        State state2 = new State();
        this.f12028b = state2;
        state = state == null ? new State() : state;
        if (i != 0) {
            state.f12046a = i;
        }
        TypedArray typedArrayM13945b = m13945b(context, state.f12046a, i2, i3);
        Resources resources = context.getResources();
        this.f12029c = typedArrayM13945b.getDimensionPixelSize(ebe.Badge_badgeRadius, -1);
        this.f12035i = context.getResources().getDimensionPixelSize(x6e.mtrl_badge_horizontal_edge_offset);
        this.f12036j = context.getResources().getDimensionPixelSize(x6e.mtrl_badge_text_horizontal_edge_offset);
        this.f12030d = typedArrayM13945b.getDimensionPixelSize(ebe.Badge_badgeWithTextRadius, -1);
        this.f12031e = typedArrayM13945b.getDimension(ebe.Badge_badgeWidth, resources.getDimension(x6e.m3_badge_size));
        this.f12033g = typedArrayM13945b.getDimension(ebe.Badge_badgeWithTextWidth, resources.getDimension(x6e.m3_badge_with_text_size));
        this.f12032f = typedArrayM13945b.getDimension(ebe.Badge_badgeHeight, resources.getDimension(x6e.m3_badge_size));
        this.f12034h = typedArrayM13945b.getDimension(ebe.Badge_badgeWithTextHeight, resources.getDimension(x6e.m3_badge_with_text_size));
        boolean z = true;
        this.f12037k = typedArrayM13945b.getInt(ebe.Badge_offsetAlignmentMode, 1);
        this.f12038l = typedArrayM13945b.getInt(ebe.Badge_badgeFixedEdge, 0);
        state2.f12054q = state.f12054q == -2 ? Constants.MAX_HOST_LENGTH : state.f12054q;
        if (state.f12056x != -2) {
            state2.f12056x = state.f12056x;
        } else if (typedArrayM13945b.hasValue(ebe.Badge_number)) {
            state2.f12056x = typedArrayM13945b.getInt(ebe.Badge_number, 0);
        } else {
            state2.f12056x = -1;
        }
        if (state.f12055s != null) {
            state2.f12055s = state.f12055s;
        } else if (typedArrayM13945b.hasValue(ebe.Badge_badgeText)) {
            state2.f12055s = typedArrayM13945b.getString(ebe.Badge_badgeText);
        }
        state2.f12041M = state.f12041M;
        state2.f12042Q = state.f12042Q == null ? context.getString(v9e.mtrl_badge_numberless_content_description) : state.f12042Q;
        state2.f12043X = state.f12043X == 0 ? s9e.mtrl_badge_content_description : state.f12043X;
        state2.f12044Y = state.f12044Y == 0 ? v9e.mtrl_exceed_max_badge_number_content_description : state.f12044Y;
        if (state.h0 != null && !state.h0.booleanValue()) {
            z = false;
        }
        state2.h0 = Boolean.valueOf(z);
        state2.f12057y = state.f12057y == -2 ? typedArrayM13945b.getInt(ebe.Badge_maxCharacterCount, -2) : state.f12057y;
        state2.f12039H = state.f12039H == -2 ? typedArrayM13945b.getInt(ebe.Badge_maxNumber, -2) : state.f12039H;
        state2.f12050e = Integer.valueOf(state.f12050e == null ? typedArrayM13945b.getResourceId(ebe.Badge_badgeShapeAppearance, pae.ShapeAppearance_M3_Sys_Shape_Corner_Full) : state.f12050e.intValue());
        state2.f12051f = Integer.valueOf(state.f12051f == null ? typedArrayM13945b.getResourceId(ebe.Badge_badgeShapeAppearanceOverlay, 0) : state.f12051f.intValue());
        state2.f12052g = Integer.valueOf(state.f12052g == null ? typedArrayM13945b.getResourceId(ebe.Badge_badgeWithTextShapeAppearance, pae.ShapeAppearance_M3_Sys_Shape_Corner_Full) : state.f12052g.intValue());
        state2.f12053h = Integer.valueOf(state.f12053h == null ? typedArrayM13945b.getResourceId(ebe.Badge_badgeWithTextShapeAppearanceOverlay, 0) : state.f12053h.intValue());
        state2.f12047b = Integer.valueOf(state.f12047b == null ? m13931I(context, typedArrayM13945b, ebe.Badge_backgroundColor) : state.f12047b.intValue());
        state2.f12049d = Integer.valueOf(state.f12049d == null ? typedArrayM13945b.getResourceId(ebe.Badge_badgeTextAppearance, pae.TextAppearance_MaterialComponents_Badge) : state.f12049d.intValue());
        if (state.f12048c != null) {
            state2.f12048c = state.f12048c;
        } else if (typedArrayM13945b.hasValue(ebe.Badge_badgeTextColor)) {
            state2.f12048c = Integer.valueOf(m13931I(context, typedArrayM13945b, ebe.Badge_badgeTextColor));
        } else {
            state2.f12048c = Integer.valueOf(new mgh(context, state2.f12049d.intValue()).m39028j().getDefaultColor());
        }
        state2.f12045Z = Integer.valueOf(state.f12045Z == null ? typedArrayM13945b.getInt(ebe.Badge_badgeGravity, 8388661) : state.f12045Z.intValue());
        state2.i0 = Integer.valueOf(state.i0 == null ? typedArrayM13945b.getDimensionPixelSize(ebe.Badge_badgeWidePadding, resources.getDimensionPixelSize(x6e.mtrl_badge_long_text_horizontal_padding)) : state.i0.intValue());
        state2.j0 = Integer.valueOf(state.j0 == null ? typedArrayM13945b.getDimensionPixelSize(ebe.Badge_badgeVerticalPadding, resources.getDimensionPixelSize(x6e.m3_badge_with_text_vertical_padding)) : state.j0.intValue());
        state2.k0 = Integer.valueOf(state.k0 == null ? typedArrayM13945b.getDimensionPixelOffset(ebe.Badge_horizontalOffset, 0) : state.k0.intValue());
        state2.l0 = Integer.valueOf(state.l0 == null ? typedArrayM13945b.getDimensionPixelOffset(ebe.Badge_verticalOffset, 0) : state.l0.intValue());
        state2.m0 = Integer.valueOf(state.m0 == null ? typedArrayM13945b.getDimensionPixelOffset(ebe.Badge_horizontalOffsetWithText, state2.k0.intValue()) : state.m0.intValue());
        state2.n0 = Integer.valueOf(state.n0 == null ? typedArrayM13945b.getDimensionPixelOffset(ebe.Badge_verticalOffsetWithText, state2.l0.intValue()) : state.n0.intValue());
        state2.q0 = Integer.valueOf(state.q0 == null ? typedArrayM13945b.getDimensionPixelOffset(ebe.Badge_largeFontVerticalOffsetAdjustment, 0) : state.q0.intValue());
        state2.o0 = Integer.valueOf(state.o0 == null ? 0 : state.o0.intValue());
        state2.p0 = Integer.valueOf(state.p0 == null ? 0 : state.p0.intValue());
        state2.r0 = Boolean.valueOf(state.r0 == null ? typedArrayM13945b.getBoolean(ebe.Badge_autoAdjustToWithinGrandparentBounds, false) : state.r0.booleanValue());
        typedArrayM13945b.recycle();
        if (state.f12040L == null) {
            state2.f12040L = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            state2.f12040L = state.f12040L;
        }
        this.f12027a = state;
    }

    /* renamed from: I */
    public static int m13931I(Context context, TypedArray typedArray, int i) {
        return yya.m58494a(context, typedArray, i).getDefaultColor();
    }

    /* renamed from: A */
    public String m13932A() {
        return this.f12028b.f12055s;
    }

    /* renamed from: B */
    public int m13933B() {
        return this.f12028b.f12049d.intValue();
    }

    /* renamed from: C */
    public int m13934C() {
        return this.f12028b.n0.intValue();
    }

    /* renamed from: D */
    public int m13935D() {
        return this.f12028b.l0.intValue();
    }

    /* renamed from: E */
    public boolean m13936E() {
        return this.f12028b.f12056x != -1;
    }

    /* renamed from: F */
    public boolean m13937F() {
        return this.f12028b.f12055s != null;
    }

    /* renamed from: G */
    public boolean m13938G() {
        return this.f12028b.r0.booleanValue();
    }

    /* renamed from: H */
    public boolean m13939H() {
        return this.f12028b.h0.booleanValue();
    }

    /* renamed from: J */
    public void m13940J(int i) {
        this.f12027a.f12054q = i;
        this.f12028b.f12054q = i;
    }

    /* renamed from: K */
    public void m13941K(int i) {
        this.f12027a.f12047b = Integer.valueOf(i);
        this.f12028b.f12047b = Integer.valueOf(i);
    }

    /* renamed from: L */
    public void m13942L(int i) {
        this.f12027a.f12056x = i;
        this.f12028b.f12056x = i;
    }

    /* renamed from: M */
    public void m13943M(boolean z) {
        this.f12027a.h0 = Boolean.valueOf(z);
        this.f12028b.h0 = Boolean.valueOf(z);
    }

    /* renamed from: a */
    public void m13944a() {
        m13942L(-1);
    }

    /* renamed from: b */
    public final TypedArray m13945b(Context context, int i, int i2, int i3) throws XmlPullParserException, Resources.NotFoundException, IOException {
        AttributeSet attributeSet;
        int styleAttribute;
        if (i != 0) {
            AttributeSet attributeSetM56952k = xy5.m56952k(context, i, "badge");
            styleAttribute = attributeSetM56952k.getStyleAttribute();
            attributeSet = attributeSetM56952k;
        } else {
            attributeSet = null;
            styleAttribute = 0;
        }
        return bkh.m19305i(context, attributeSet, ebe.Badge, i2, styleAttribute == 0 ? i3 : styleAttribute, new int[0]);
    }

    /* renamed from: c */
    public int m13946c() {
        return this.f12028b.o0.intValue();
    }

    /* renamed from: d */
    public int m13947d() {
        return this.f12028b.p0.intValue();
    }

    /* renamed from: e */
    public int m13948e() {
        return this.f12028b.f12054q;
    }

    /* renamed from: f */
    public int m13949f() {
        return this.f12028b.f12047b.intValue();
    }

    /* renamed from: g */
    public int m13950g() {
        return this.f12028b.f12045Z.intValue();
    }

    /* renamed from: h */
    public int m13951h() {
        return this.f12028b.i0.intValue();
    }

    /* renamed from: i */
    public int m13952i() {
        return this.f12028b.f12051f.intValue();
    }

    /* renamed from: j */
    public int m13953j() {
        return this.f12028b.f12050e.intValue();
    }

    /* renamed from: k */
    public int m13954k() {
        return this.f12028b.f12048c.intValue();
    }

    /* renamed from: l */
    public int m13955l() {
        return this.f12028b.j0.intValue();
    }

    /* renamed from: m */
    public int m13956m() {
        return this.f12028b.f12053h.intValue();
    }

    /* renamed from: n */
    public int m13957n() {
        return this.f12028b.f12052g.intValue();
    }

    /* renamed from: o */
    public int m13958o() {
        return this.f12028b.f12044Y;
    }

    /* renamed from: p */
    public CharSequence m13959p() {
        return this.f12028b.f12041M;
    }

    /* renamed from: q */
    public CharSequence m13960q() {
        return this.f12028b.f12042Q;
    }

    /* renamed from: r */
    public int m13961r() {
        return this.f12028b.f12043X;
    }

    /* renamed from: s */
    public int m13962s() {
        return this.f12028b.m0.intValue();
    }

    /* renamed from: t */
    public int m13963t() {
        return this.f12028b.k0.intValue();
    }

    /* renamed from: u */
    public int m13964u() {
        return this.f12028b.q0.intValue();
    }

    /* renamed from: v */
    public int m13965v() {
        return this.f12028b.f12057y;
    }

    /* renamed from: w */
    public int m13966w() {
        return this.f12028b.f12039H;
    }

    /* renamed from: x */
    public int m13967x() {
        return this.f12028b.f12056x;
    }

    /* renamed from: y */
    public Locale m13968y() {
        return this.f12028b.f12040L;
    }

    /* renamed from: z */
    public State m13969z() {
        return this.f12027a;
    }

    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new C10935a();

        /* renamed from: H */
        public int f12039H;

        /* renamed from: L */
        public Locale f12040L;

        /* renamed from: M */
        public CharSequence f12041M;

        /* renamed from: Q */
        public CharSequence f12042Q;

        /* renamed from: X */
        public int f12043X;

        /* renamed from: Y */
        public int f12044Y;

        /* renamed from: Z */
        public Integer f12045Z;

        /* renamed from: a */
        public int f12046a;

        /* renamed from: b */
        public Integer f12047b;

        /* renamed from: c */
        public Integer f12048c;

        /* renamed from: d */
        public Integer f12049d;

        /* renamed from: e */
        public Integer f12050e;

        /* renamed from: f */
        public Integer f12051f;

        /* renamed from: g */
        public Integer f12052g;

        /* renamed from: h */
        public Integer f12053h;
        public Boolean h0;
        public Integer i0;
        public Integer j0;
        public Integer k0;
        public Integer l0;
        public Integer m0;
        public Integer n0;
        public Integer o0;
        public Integer p0;

        /* renamed from: q */
        public int f12054q;
        public Integer q0;
        public Boolean r0;

        /* renamed from: s */
        public String f12055s;
        public Integer s0;

        /* renamed from: x */
        public int f12056x;

        /* renamed from: y */
        public int f12057y;

        /* renamed from: com.google.android.material.badge.BadgeState$State$a */
        public class C10935a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public State createFromParcel(Parcel parcel) {
                return new State(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public State[] newArray(int i) {
                return new State[i];
            }
        }

        public State() {
            this.f12054q = Constants.MAX_HOST_LENGTH;
            this.f12056x = -2;
            this.f12057y = -2;
            this.f12039H = -2;
            this.h0 = Boolean.TRUE;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f12046a);
            parcel.writeSerializable(this.f12047b);
            parcel.writeSerializable(this.f12048c);
            parcel.writeSerializable(this.f12049d);
            parcel.writeSerializable(this.f12050e);
            parcel.writeSerializable(this.f12051f);
            parcel.writeSerializable(this.f12052g);
            parcel.writeSerializable(this.f12053h);
            parcel.writeInt(this.f12054q);
            parcel.writeString(this.f12055s);
            parcel.writeInt(this.f12056x);
            parcel.writeInt(this.f12057y);
            parcel.writeInt(this.f12039H);
            CharSequence charSequence = this.f12041M;
            parcel.writeString(charSequence != null ? charSequence.toString() : null);
            CharSequence charSequence2 = this.f12042Q;
            parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
            parcel.writeInt(this.f12043X);
            parcel.writeSerializable(this.f12045Z);
            parcel.writeSerializable(this.i0);
            parcel.writeSerializable(this.j0);
            parcel.writeSerializable(this.k0);
            parcel.writeSerializable(this.l0);
            parcel.writeSerializable(this.m0);
            parcel.writeSerializable(this.n0);
            parcel.writeSerializable(this.q0);
            parcel.writeSerializable(this.o0);
            parcel.writeSerializable(this.p0);
            parcel.writeSerializable(this.h0);
            parcel.writeSerializable(this.f12040L);
            parcel.writeSerializable(this.r0);
            parcel.writeSerializable(this.s0);
        }

        public State(Parcel parcel) {
            this.f12054q = Constants.MAX_HOST_LENGTH;
            this.f12056x = -2;
            this.f12057y = -2;
            this.f12039H = -2;
            this.h0 = Boolean.TRUE;
            this.f12046a = parcel.readInt();
            this.f12047b = (Integer) parcel.readSerializable();
            this.f12048c = (Integer) parcel.readSerializable();
            this.f12049d = (Integer) parcel.readSerializable();
            this.f12050e = (Integer) parcel.readSerializable();
            this.f12051f = (Integer) parcel.readSerializable();
            this.f12052g = (Integer) parcel.readSerializable();
            this.f12053h = (Integer) parcel.readSerializable();
            this.f12054q = parcel.readInt();
            this.f12055s = parcel.readString();
            this.f12056x = parcel.readInt();
            this.f12057y = parcel.readInt();
            this.f12039H = parcel.readInt();
            this.f12041M = parcel.readString();
            this.f12042Q = parcel.readString();
            this.f12043X = parcel.readInt();
            this.f12045Z = (Integer) parcel.readSerializable();
            this.i0 = (Integer) parcel.readSerializable();
            this.j0 = (Integer) parcel.readSerializable();
            this.k0 = (Integer) parcel.readSerializable();
            this.l0 = (Integer) parcel.readSerializable();
            this.m0 = (Integer) parcel.readSerializable();
            this.n0 = (Integer) parcel.readSerializable();
            this.q0 = (Integer) parcel.readSerializable();
            this.o0 = (Integer) parcel.readSerializable();
            this.p0 = (Integer) parcel.readSerializable();
            this.h0 = (Boolean) parcel.readSerializable();
            this.f12040L = (Locale) parcel.readSerializable();
            this.r0 = (Boolean) parcel.readSerializable();
            this.s0 = (Integer) parcel.readSerializable();
        }
    }
}
