package p001o;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import p001o.poe;

/* loaded from: classes2.dex */
public final class ek0 {

    /* renamed from: b */
    public static final PorterDuff.Mode f21774b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    public static ek0 f21775c;

    /* renamed from: a */
    public poe f21776a;

    /* renamed from: o.ek0$a */
    public class C13208a implements poe.InterfaceC16150c {

        /* renamed from: a */
        public final int[] f21777a = {n7e.abc_textfield_search_default_mtrl_alpha, n7e.abc_textfield_default_mtrl_alpha, n7e.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b */
        public final int[] f21778b = {n7e.abc_ic_commit_search_api_mtrl_alpha, n7e.abc_seekbar_tick_mark_material, n7e.abc_ic_menu_share_mtrl_alpha, n7e.abc_ic_menu_copy_mtrl_am_alpha, n7e.abc_ic_menu_cut_mtrl_alpha, n7e.abc_ic_menu_selectall_mtrl_alpha, n7e.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c */
        public final int[] f21779c = {n7e.abc_textfield_activated_mtrl_alpha, n7e.abc_textfield_search_activated_mtrl_alpha, n7e.abc_cab_background_top_mtrl_alpha, n7e.abc_text_cursor_material, n7e.abc_text_select_handle_left_mtrl, n7e.abc_text_select_handle_middle_mtrl, n7e.abc_text_select_handle_right_mtrl};

        /* renamed from: d */
        public final int[] f21780d = {n7e.abc_popup_background_mtrl_mult, n7e.abc_cab_background_internal_bg, n7e.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e */
        public final int[] f21781e = {n7e.abc_tab_indicator_material, n7e.abc_textfield_search_material};

        /* renamed from: f */
        public final int[] f21782f = {n7e.abc_btn_check_material, n7e.abc_btn_radio_material, n7e.abc_btn_check_material_anim, n7e.abc_btn_radio_material_anim};

        @Override // p001o.poe.InterfaceC16150c
        /* renamed from: a */
        public Drawable mo25171a(poe poeVar, Context context, int i) {
            if (i == n7e.abc_cab_background_top_material) {
                return new LayerDrawable(new Drawable[]{poeVar.m43978i(context, n7e.abc_cab_background_internal_bg), poeVar.m43978i(context, n7e.abc_cab_background_top_mtrl_alpha)});
            }
            if (i == n7e.abc_ratingbar_material) {
                return m25182l(poeVar, context, b7e.abc_star_big);
            }
            if (i == n7e.abc_ratingbar_indicator_material) {
                return m25182l(poeVar, context, b7e.abc_star_medium);
            }
            if (i == n7e.abc_ratingbar_small_material) {
                return m25182l(poeVar, context, b7e.abc_star_small);
            }
            return null;
        }

        @Override // p001o.poe.InterfaceC16150c
        /* renamed from: b */
        public ColorStateList mo25172b(Context context, int i) {
            if (i == n7e.abc_edit_text_material) {
                return lk0.m37352a(context, l6e.abc_tint_edittext);
            }
            if (i == n7e.abc_switch_track_mtrl_alpha) {
                return lk0.m37352a(context, l6e.abc_tint_switch_track);
            }
            if (i == n7e.abc_switch_thumb_material) {
                return m25181k(context);
            }
            if (i == n7e.abc_btn_default_mtrl_shape) {
                return m25180j(context);
            }
            if (i == n7e.abc_btn_borderless_material) {
                return m25177g(context);
            }
            if (i == n7e.abc_btn_colored_material) {
                return m25179i(context);
            }
            if (i == n7e.abc_spinner_mtrl_am_alpha || i == n7e.abc_spinner_textfield_background_material) {
                return lk0.m37352a(context, l6e.abc_tint_spinner);
            }
            if (m25176f(this.f21778b, i)) {
                return dkh.m23381e(context, z5e.colorControlNormal);
            }
            if (m25176f(this.f21781e, i)) {
                return lk0.m37352a(context, l6e.abc_tint_default);
            }
            if (m25176f(this.f21782f, i)) {
                return lk0.m37352a(context, l6e.abc_tint_btn_checkable);
            }
            if (i == n7e.abc_seekbar_thumb_material) {
                return lk0.m37352a(context, l6e.abc_tint_seek_thumb);
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0066 A[RETURN] */
        @Override // p001o.poe.InterfaceC16150c
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean mo25173c(Context context, int i, Drawable drawable) {
            PorterDuff.Mode mode;
            int i2;
            boolean z;
            int iRound;
            PorterDuff.Mode mode2 = ek0.f21774b;
            if (m25176f(this.f21777a, i)) {
                i2 = z5e.colorControlNormal;
            } else if (m25176f(this.f21779c, i)) {
                i2 = z5e.colorControlActivated;
            } else {
                if (m25176f(this.f21780d, i)) {
                    mode2 = PorterDuff.Mode.MULTIPLY;
                } else {
                    if (i == n7e.abc_list_divider_mtrl_alpha) {
                        z = true;
                        iRound = Math.round(40.8f);
                        i2 = 16842800;
                        mode = mode2;
                        if (z) {
                            return false;
                        }
                        Drawable drawableMutate = drawable.mutate();
                        drawableMutate.setColorFilter(ek0.m25164e(dkh.m23379c(context, i2), mode));
                        if (iRound != -1) {
                            drawableMutate.setAlpha(iRound);
                        }
                        return true;
                    }
                    if (i != n7e.abc_dialog_material_background) {
                        mode = mode2;
                        i2 = 0;
                        z = false;
                        iRound = -1;
                        if (z) {
                        }
                    }
                }
                mode = mode2;
                iRound = -1;
                i2 = 16842801;
                z = true;
                if (z) {
                }
            }
            mode = mode2;
            z = true;
            iRound = -1;
            if (z) {
            }
        }

        @Override // p001o.poe.InterfaceC16150c
        /* renamed from: d */
        public PorterDuff.Mode mo25174d(int i) {
            if (i == n7e.abc_switch_thumb_material) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // p001o.poe.InterfaceC16150c
        /* renamed from: e */
        public boolean mo25175e(Context context, int i, Drawable drawable) {
            if (i == n7e.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                m25183m(layerDrawable.findDrawableByLayerId(R.id.background), dkh.m23379c(context, z5e.colorControlNormal), ek0.f21774b);
                m25183m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), dkh.m23379c(context, z5e.colorControlNormal), ek0.f21774b);
                m25183m(layerDrawable.findDrawableByLayerId(R.id.progress), dkh.m23379c(context, z5e.colorControlActivated), ek0.f21774b);
                return true;
            }
            if (i != n7e.abc_ratingbar_material && i != n7e.abc_ratingbar_indicator_material && i != n7e.abc_ratingbar_small_material) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m25183m(layerDrawable2.findDrawableByLayerId(R.id.background), dkh.m23378b(context, z5e.colorControlNormal), ek0.f21774b);
            m25183m(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), dkh.m23379c(context, z5e.colorControlActivated), ek0.f21774b);
            m25183m(layerDrawable2.findDrawableByLayerId(R.id.progress), dkh.m23379c(context, z5e.colorControlActivated), ek0.f21774b);
            return true;
        }

        /* renamed from: f */
        public final boolean m25176f(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        public final ColorStateList m25177g(Context context) {
            return m25178h(context, 0);
        }

        /* renamed from: h */
        public final ColorStateList m25178h(Context context, int i) {
            int iM23379c = dkh.m23379c(context, z5e.colorControlHighlight);
            return new ColorStateList(new int[][]{dkh.f20151b, dkh.f20154e, dkh.f20152c, dkh.f20158i}, new int[]{dkh.m23378b(context, z5e.colorButtonNormal), ni3.m40619k(iM23379c, i), ni3.m40619k(iM23379c, i), i});
        }

        /* renamed from: i */
        public final ColorStateList m25179i(Context context) {
            return m25178h(context, dkh.m23379c(context, z5e.colorAccent));
        }

        /* renamed from: j */
        public final ColorStateList m25180j(Context context) {
            return m25178h(context, dkh.m23379c(context, z5e.colorButtonNormal));
        }

        /* renamed from: k */
        public final ColorStateList m25181k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList colorStateListM23381e = dkh.m23381e(context, z5e.colorSwitchThumbNormal);
            if (colorStateListM23381e == null || !colorStateListM23381e.isStateful()) {
                iArr[0] = dkh.f20151b;
                iArr2[0] = dkh.m23378b(context, z5e.colorSwitchThumbNormal);
                iArr[1] = dkh.f20155f;
                iArr2[1] = dkh.m23379c(context, z5e.colorControlActivated);
                iArr[2] = dkh.f20158i;
                iArr2[2] = dkh.m23379c(context, z5e.colorSwitchThumbNormal);
            } else {
                int[] iArr3 = dkh.f20151b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListM23381e.getColorForState(iArr3, 0);
                iArr[1] = dkh.f20155f;
                iArr2[1] = dkh.m23379c(context, z5e.colorControlActivated);
                iArr[2] = dkh.f20158i;
                iArr2[2] = colorStateListM23381e.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        /* renamed from: l */
        public final LayerDrawable m25182l(poe poeVar, Context context, int i) throws Resources.NotFoundException {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable drawableM43978i = poeVar.m43978i(context, n7e.abc_star_black_48dp);
            Drawable drawableM43978i2 = poeVar.m43978i(context, n7e.abc_star_half_black_48dp);
            if ((drawableM43978i instanceof BitmapDrawable) && drawableM43978i.getIntrinsicWidth() == dimensionPixelSize && drawableM43978i.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableM43978i;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableM43978i.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableM43978i.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableM43978i2 instanceof BitmapDrawable) && drawableM43978i2.getIntrinsicWidth() == dimensionPixelSize && drawableM43978i2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableM43978i2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableM43978i2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableM43978i2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        /* renamed from: m */
        public final void m25183m(Drawable drawable, int i, PorterDuff.Mode mode) {
            Drawable drawableMutate = drawable.mutate();
            if (mode == null) {
                mode = ek0.f21774b;
            }
            drawableMutate.setColorFilter(ek0.m25164e(i, mode));
        }
    }

    /* renamed from: b */
    public static synchronized ek0 m25163b() {
        if (f21775c == null) {
            m25165h();
        }
        return f21775c;
    }

    /* renamed from: e */
    public static synchronized PorterDuffColorFilter m25164e(int i, PorterDuff.Mode mode) {
        return poe.m43969k(i, mode);
    }

    /* renamed from: h */
    public static synchronized void m25165h() {
        if (f21775c == null) {
            ek0 ek0Var = new ek0();
            f21775c = ek0Var;
            ek0Var.f21776a = poe.m43968g();
            f21775c.f21776a.m43986t(new C13208a());
        }
    }

    /* renamed from: i */
    public static void m25166i(Drawable drawable, ymh ymhVar, int[] iArr) {
        poe.m43972v(drawable, ymhVar, iArr);
    }

    /* renamed from: c */
    public synchronized Drawable m25167c(Context context, int i) {
        return this.f21776a.m43978i(context, i);
    }

    /* renamed from: d */
    public synchronized Drawable m25168d(Context context, int i, boolean z) {
        return this.f21776a.m43979j(context, i, z);
    }

    /* renamed from: f */
    public synchronized ColorStateList m25169f(Context context, int i) {
        return this.f21776a.m43980l(context, i);
    }

    /* renamed from: g */
    public synchronized void m25170g(Context context) {
        this.f21776a.m43984r(context);
    }
}
