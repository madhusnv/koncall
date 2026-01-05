package p001o;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public abstract class rqe extends Resources {

    /* renamed from: a */
    public final Resources f43963a;

    public rqe(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f43963a = resources;
    }

    /* renamed from: a */
    public final Drawable m47073a(int i) {
        return super.getDrawable(i);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getAnimation(int i) {
        return this.f43963a.getAnimation(i);
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i) {
        return this.f43963a.getBoolean(i);
    }

    @Override // android.content.res.Resources
    public int getColor(int i) {
        return this.f43963a.getColor(i);
    }

    @Override // android.content.res.Resources
    public ColorStateList getColorStateList(int i) {
        return this.f43963a.getColorStateList(i);
    }

    @Override // android.content.res.Resources
    public Configuration getConfiguration() {
        return this.f43963a.getConfiguration();
    }

    @Override // android.content.res.Resources
    public float getDimension(int i) {
        return this.f43963a.getDimension(i);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i) {
        return this.f43963a.getDimensionPixelOffset(i);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i) {
        return this.f43963a.getDimensionPixelSize(i);
    }

    @Override // android.content.res.Resources
    public DisplayMetrics getDisplayMetrics() {
        return this.f43963a.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i, Resources.Theme theme) {
        return ppe.m44034e(this.f43963a, i, theme);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i, int i2) {
        return ppe.m44035f(this.f43963a, i, i2, null);
    }

    @Override // android.content.res.Resources
    public float getFraction(int i, int i2, int i3) {
        return this.f43963a.getFraction(i, i2, i3);
    }

    @Override // android.content.res.Resources
    public int getIdentifier(String str, String str2, String str3) {
        return this.f43963a.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int i) {
        return this.f43963a.getIntArray(i);
    }

    @Override // android.content.res.Resources
    public int getInteger(int i) {
        return this.f43963a.getInteger(i);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getLayout(int i) {
        return this.f43963a.getLayout(i);
    }

    @Override // android.content.res.Resources
    public Movie getMovie(int i) {
        return this.f43963a.getMovie(i);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i, int i2, Object... objArr) {
        return this.f43963a.getQuantityString(i, i2, objArr);
    }

    @Override // android.content.res.Resources
    public CharSequence getQuantityText(int i, int i2) {
        return this.f43963a.getQuantityText(i, i2);
    }

    @Override // android.content.res.Resources
    public String getResourceEntryName(int i) {
        return this.f43963a.getResourceEntryName(i);
    }

    @Override // android.content.res.Resources
    public String getResourceName(int i) {
        return this.f43963a.getResourceName(i);
    }

    @Override // android.content.res.Resources
    public String getResourcePackageName(int i) {
        return this.f43963a.getResourcePackageName(i);
    }

    @Override // android.content.res.Resources
    public String getResourceTypeName(int i) {
        return this.f43963a.getResourceTypeName(i);
    }

    @Override // android.content.res.Resources
    public String getString(int i) {
        return this.f43963a.getString(i);
    }

    @Override // android.content.res.Resources
    public String[] getStringArray(int i) {
        return this.f43963a.getStringArray(i);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i) {
        return this.f43963a.getText(i);
    }

    @Override // android.content.res.Resources
    public CharSequence[] getTextArray(int i) {
        return this.f43963a.getTextArray(i);
    }

    @Override // android.content.res.Resources
    public void getValue(int i, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        this.f43963a.getValue(i, typedValue, z);
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        this.f43963a.getValueForDensity(i, i2, typedValue, z);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getXml(int i) {
        return this.f43963a.getXml(i);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.f43963a.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainTypedArray(int i) {
        return this.f43963a.obtainTypedArray(i);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i) {
        return this.f43963a.openRawResource(i);
    }

    @Override // android.content.res.Resources
    public AssetFileDescriptor openRawResourceFd(int i) {
        return this.f43963a.openRawResourceFd(i);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        this.f43963a.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) throws XmlPullParserException, IOException {
        this.f43963a.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.f43963a;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
        return ppe.m44035f(this.f43963a, i, i2, theme);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i, int i2) {
        return this.f43963a.getQuantityString(i, i2);
    }

    @Override // android.content.res.Resources
    public String getString(int i, Object... objArr) {
        return this.f43963a.getString(i, objArr);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i, CharSequence charSequence) {
        return this.f43963a.getText(i, charSequence);
    }

    @Override // android.content.res.Resources
    public void getValue(String str, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        this.f43963a.getValue(str, typedValue, z);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i, TypedValue typedValue) {
        return this.f43963a.openRawResource(i, typedValue);
    }
}
