package p001o;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class ccg extends hoe implements View.OnClickListener {

    /* renamed from: H */
    public final SearchableInfo f17840H;

    /* renamed from: L */
    public final Context f17841L;

    /* renamed from: M */
    public final WeakHashMap f17842M;

    /* renamed from: Q */
    public final int f17843Q;

    /* renamed from: X */
    public boolean f17844X;

    /* renamed from: Y */
    public int f17845Y;

    /* renamed from: Z */
    public ColorStateList f17846Z;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;

    /* renamed from: y */
    public final SearchView f17847y;

    /* renamed from: o.ccg$a */
    public static final class C12637a {

        /* renamed from: a */
        public final TextView f17848a;

        /* renamed from: b */
        public final TextView f17849b;

        /* renamed from: c */
        public final ImageView f17850c;

        /* renamed from: d */
        public final ImageView f17851d;

        /* renamed from: e */
        public final ImageView f17852e;

        public C12637a(View view) {
            this.f17848a = (TextView) view.findViewById(R.id.text1);
            this.f17849b = (TextView) view.findViewById(R.id.text2);
            this.f17850c = (ImageView) view.findViewById(R.id.icon1);
            this.f17851d = (ImageView) view.findViewById(R.id.icon2);
            this.f17852e = (ImageView) view.findViewById(r8e.edit_query);
        }
    }

    public ccg(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f17844X = false;
        this.f17845Y = 1;
        this.h0 = -1;
        this.i0 = -1;
        this.j0 = -1;
        this.k0 = -1;
        this.l0 = -1;
        this.m0 = -1;
        this.f17847y = searchView;
        this.f17840H = searchableInfo;
        this.f17843Q = searchView.getSuggestionCommitIconResId();
        this.f17841L = context;
        this.f17842M = weakHashMap;
    }

    /* renamed from: o */
    public static String m20853o(Cursor cursor, String str) {
        return m20854w(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: w */
    public static String m20854w(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: A */
    public final void m20855A(String str, Drawable drawable) {
        if (drawable != null) {
            this.f17842M.put(str, drawable.getConstantState());
        }
    }

    /* renamed from: B */
    public final void m20856B(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // p001o.pd4, p001o.qd4.InterfaceC16338a
    /* renamed from: a */
    public void mo20857a(Cursor cursor) {
        if (this.f17844X) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo20857a(cursor);
            if (cursor != null) {
                this.h0 = cursor.getColumnIndex("suggest_text_1");
                this.i0 = cursor.getColumnIndex("suggest_text_2");
                this.j0 = cursor.getColumnIndex("suggest_text_2_url");
                this.k0 = cursor.getColumnIndex("suggest_icon_1");
                this.l0 = cursor.getColumnIndex("suggest_icon_2");
                this.m0 = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception unused) {
        }
    }

    @Override // p001o.pd4, p001o.qd4.InterfaceC16338a
    /* renamed from: b */
    public CharSequence mo20858b(Cursor cursor) {
        String strM20853o;
        String strM20853o2;
        if (cursor == null) {
            return null;
        }
        String strM20853o3 = m20853o(cursor, "suggest_intent_query");
        if (strM20853o3 != null) {
            return strM20853o3;
        }
        if (this.f17840H.shouldRewriteQueryFromData() && (strM20853o2 = m20853o(cursor, "suggest_intent_data")) != null) {
            return strM20853o2;
        }
        if (!this.f17840H.shouldRewriteQueryFromText() || (strM20853o = m20853o(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return strM20853o;
    }

    @Override // p001o.qd4.InterfaceC16338a
    /* renamed from: c */
    public Cursor mo20859c(CharSequence charSequence) {
        String string = charSequence == null ? "" : charSequence.toString();
        if (this.f17847y.getVisibility() == 0 && this.f17847y.getWindowVisibility() == 0) {
            try {
                Cursor cursorM20872v = m20872v(this.f17840H, string, 50);
                if (cursorM20872v != null) {
                    cursorM20872v.getCount();
                    return cursorM20872v;
                }
            } catch (RuntimeException unused) {
            }
        }
        return null;
    }

    @Override // p001o.pd4
    /* renamed from: e */
    public void mo20860e(View view, Context context, Cursor cursor) {
        C12637a c12637a = (C12637a) view.getTag();
        int i = this.m0;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (c12637a.f17848a != null) {
            m20875z(c12637a.f17848a, m20854w(cursor, this.h0));
        }
        if (c12637a.f17849b != null) {
            String strM20854w = m20854w(cursor, this.j0);
            CharSequence charSequenceM20863l = strM20854w != null ? m20863l(strM20854w) : m20854w(cursor, this.i0);
            if (TextUtils.isEmpty(charSequenceM20863l)) {
                TextView textView = c12637a.f17848a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    c12637a.f17848a.setMaxLines(2);
                }
            } else {
                TextView textView2 = c12637a.f17848a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    c12637a.f17848a.setMaxLines(1);
                }
            }
            m20875z(c12637a.f17849b, charSequenceM20863l);
        }
        ImageView imageView = c12637a.f17850c;
        if (imageView != null) {
            m20874y(imageView, m20870t(cursor), 4);
        }
        ImageView imageView2 = c12637a.f17851d;
        if (imageView2 != null) {
            m20874y(imageView2, m20871u(cursor), 8);
        }
        int i3 = this.f17845Y;
        if (i3 != 2 && (i3 != 1 || (i2 & 1) == 0)) {
            c12637a.f17852e.setVisibility(8);
            return;
        }
        c12637a.f17852e.setVisibility(0);
        c12637a.f17852e.setTag(c12637a.f17848a.getText());
        c12637a.f17852e.setOnClickListener(this);
    }

    @Override // p001o.pd4, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View viewMo30887g = mo30887g(this.f17841L, mo43414d(), viewGroup);
            if (viewMo30887g != null) {
                ((C12637a) viewMo30887g.getTag()).f17848a.setText(e.toString());
            }
            return viewMo30887g;
        }
    }

    @Override // p001o.pd4, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View viewMo20861h = mo20861h(this.f17841L, mo43414d(), viewGroup);
            if (viewMo20861h != null) {
                ((C12637a) viewMo20861h.getTag()).f17848a.setText(e.toString());
            }
            return viewMo20861h;
        }
    }

    @Override // p001o.hoe, p001o.pd4
    /* renamed from: h */
    public View mo20861h(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewMo20861h = super.mo20861h(context, cursor, viewGroup);
        viewMo20861h.setTag(new C12637a(viewMo20861h));
        ((ImageView) viewMo20861h.findViewById(r8e.edit_query)).setImageResource(this.f17843Q);
        return viewMo20861h;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    /* renamed from: k */
    public final Drawable m20862k(String str) {
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f17842M.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: l */
    public final CharSequence m20863l(CharSequence charSequence) {
        if (this.f17846Z == null) {
            TypedValue typedValue = new TypedValue();
            this.f17841L.getTheme().resolveAttribute(z5e.textColorSearchUrl, typedValue, true);
            this.f17846Z = this.f17841L.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f17846Z, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: m */
    public final Drawable m20864m(ComponentName componentName) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = this.f17841L.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid icon resource ");
            sb.append(iconResource);
            sb.append(" for ");
            sb.append(componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            e.toString();
            return null;
        }
    }

    /* renamed from: n */
    public final Drawable m20865n(ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strFlattenToShortString = componentName.flattenToShortString();
        if (!this.f17842M.containsKey(strFlattenToShortString)) {
            Drawable drawableM20864m = m20864m(componentName);
            this.f17842M.put(strFlattenToShortString, drawableM20864m != null ? drawableM20864m.getConstantState() : null);
            return drawableM20864m;
        }
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f17842M.get(strFlattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f17841L.getResources());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m20856B(mo43414d());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m20856B(mo43414d());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f17847y.m4357U((CharSequence) tag);
        }
    }

    /* renamed from: p */
    public final Drawable m20866p() throws PackageManager.NameNotFoundException {
        Drawable drawableM20865n = m20865n(this.f17840H.getSearchActivity());
        return drawableM20865n != null ? drawableM20865n : this.f17841L.getPackageManager().getDefaultActivityIcon();
    }

    /* renamed from: q */
    public final Drawable m20867q(Uri uri) throws IOException {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return m20868r(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream inputStreamOpenInputStream = this.f17841L.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                return Drawable.createFromStream(inputStreamOpenInputStream, null);
            } finally {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException unused2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error closing icon stream for ");
                    sb.append(uri);
                }
            }
        } catch (FileNotFoundException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Icon not found: ");
            sb2.append(uri);
            sb2.append(", ");
            sb2.append(e.getMessage());
            return null;
        }
        StringBuilder sb22 = new StringBuilder();
        sb22.append("Icon not found: ");
        sb22.append(uri);
        sb22.append(", ");
        sb22.append(e.getMessage());
        return null;
    }

    /* renamed from: r */
    public Drawable m20868r(Uri uri) throws PackageManager.NameNotFoundException, NumberFormatException, FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f17841L.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* renamed from: s */
    public final Drawable m20869s(String str) throws NumberFormatException, IOException {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int i = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f17841L.getPackageName() + "/" + i;
            Drawable drawableM20862k = m20862k(str2);
            if (drawableM20862k != null) {
                return drawableM20862k;
            }
            Drawable drawable = c64.getDrawable(this.f17841L, i);
            m20855A(str2, drawable);
            return drawable;
        } catch (Resources.NotFoundException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Icon resource not found: ");
            sb.append(str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable drawableM20862k2 = m20862k(str);
            if (drawableM20862k2 != null) {
                return drawableM20862k2;
            }
            Drawable drawableM20867q = m20867q(Uri.parse(str));
            m20855A(str, drawableM20867q);
            return drawableM20867q;
        }
    }

    /* renamed from: t */
    public final Drawable m20870t(Cursor cursor) throws NumberFormatException, IOException {
        int i = this.k0;
        if (i == -1) {
            return null;
        }
        Drawable drawableM20869s = m20869s(cursor.getString(i));
        return drawableM20869s != null ? drawableM20869s : m20866p();
    }

    /* renamed from: u */
    public final Drawable m20871u(Cursor cursor) {
        int i = this.l0;
        if (i == -1) {
            return null;
        }
        return m20869s(cursor.getString(i));
    }

    /* renamed from: v */
    public Cursor m20872v(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            builderFragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f17841L.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    /* renamed from: x */
    public void m20873x(int i) {
        this.f17845Y = i;
    }

    /* renamed from: y */
    public final void m20874y(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: z */
    public final void m20875z(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }
}
