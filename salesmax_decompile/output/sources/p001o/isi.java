package p001o;

import android.content.Context;
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
import java.lang.ref.WeakReference;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public class isi extends rqe {

    /* renamed from: c */
    public static boolean f29206c = false;

    /* renamed from: b */
    public final WeakReference f29207b;

    public isi(Context context, Resources resources) {
        super(resources);
        this.f29207b = new WeakReference(context);
    }

    /* renamed from: b */
    public static boolean m32705b() {
        return f29206c;
    }

    /* renamed from: c */
    public static boolean m32706c() {
        m32705b();
        return false;
    }

    @Override // p001o.rqe, android.content.res.Resources
    public /* bridge */ /* synthetic */ XmlResourceParser getAnimation(int i) {
        return super.getAnimation(i);
    }

    @Override // p001o.rqe, android.content.res.Resources
    public /* bridge */ /* synthetic */ boolean getBoolean(int i) {
        return super.getBoolean(i);
    }

    @Override // p001o.rqe, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getColor(int i) {
        return super.getColor(i);
    }

    @Override // p001o.rqe, android.content.res.Resources
    public /* bridge */ /* synthetic */ ColorStateList getColorStateList(int i) {
        return super.getColorStateList(i);
    }

    @Override // p001o.rqe, android.content.res.Resources
    public /* bridge */ /* synthetic */ Configuration getConfiguration() {
        return super.getConfiguration();
    }

    @Override // p001o.rqe, android.content.res.Resources
    public /* bridge */ /* synthetic */ float getDimension(int i) {
        return super.getDimension(i);
    }

    @Override // p001o.rqe, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getDimensionPixelOffset(int i) {
        return super.getDimensionPixelOffset(i);
    }

    @Override // p001o.rqe, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getDimensionPixelSize(int i) {
        return super.getDimensionPixelSize(i);
    }

    @Override // p001o.rqe, android.content.res.Resources
    public /* bridge */ /* synthetic */ DisplayMetrics getDisplayMetrics() {
        return super.getDisplayMetrics();
    }

    @Override // p001o.rqe, android.content.res.Resources
    public /* bridge */ /* synthetic */ Drawable getDrawable(int i, Resources.Theme theme) {
        return super.getDrawable(i, theme);
    }

    @Override // p001o.rqe, android.content.res.Resources
    public /* bridge */ /* synthetic */ Drawable getDrawableForDensity(int i, int i2) {
        return super.getDrawableForDensity(i, i2);
    }

    @Override // p001o.rqe, android.content.res.Resources
    public /* bridge */ /* synthetic */ float getFraction(int i, int i2, int i3) {
        return super.getFraction(i, i2, i3);
    }

    @Override // p001o.rqe, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getIdentifier(String str, String str2, String str3) {
        return super.getIdentifier(str, str2, str3);
    }

    @Override // p001o.rqe, android.content.res.Resources
    public /* bridge */ /* synthetic */ int[] getIntArray(int i) {
        return super.getIntArray(i);
    }

    @Override // p001o.rqe, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getInteger(int i) {
        return super.getInteger(i);
    }

    @Override // p001o.rqe, android.content.res.Resources
    public /* bridge */ /* synthetic */ XmlResourceParser getLayout(int i) {
        return super.getLayout(i);
    }

    @Override // p001o.rqe, android.content.res.Resources
    public /* bridge */ /* synthetic */ Movie getMovie(int i) {
        return super.getMovie(i);
    }

    @Override // p001o.rqe, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getQuantityString(int i, int i2) {
        return super.getQuantityString(i, i2);
    }

    @Override // p001o.rqe, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence getQuantityText(int i, int i2) {
        return super.getQuantityText(i, i2);
    }

    @Override // p001o.rqe, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourceEntryName(int i) {
        return super.getResourceEntryName(i);
    }

    @Override // p001o.rqe, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourceName(int i) {
        return super.getResourceName(i);
    }

    @Override // p001o.rqe, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourcePackageName(int i) {
        return super.getResourcePackageName(i);
    }

    @Override // p001o.rqe, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourceTypeName(int i) {
        return super.getResourceTypeName(i);
    }

    @Override // p001o.rqe, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getString(int i) {
        return super.getString(i);
    }

    @Override // p001o.rqe, android.content.res.Resources
    public /* bridge */ /* synthetic */ String[] getStringArray(int i) {
        return super.getStringArray(i);
    }

    @Override // p001o.rqe, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence getText(int i) {
        return super.getText(i);
    }

    @Override // p001o.rqe, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence[] getTextArray(int i) {
        return super.getTextArray(i);
    }

    @Override // p001o.rqe, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValue(int i, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        super.getValue(i, typedValue, z);
    }

    @Override // p001o.rqe, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        super.getValueForDensity(i, i2, typedValue, z);
    }

    @Override // p001o.rqe, android.content.res.Resources
    public /* bridge */ /* synthetic */ XmlResourceParser getXml(int i) {
        return super.getXml(i);
    }

    @Override // p001o.rqe, android.content.res.Resources
    public /* bridge */ /* synthetic */ TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return super.obtainAttributes(attributeSet, iArr);
    }

    @Override // p001o.rqe, android.content.res.Resources
    public /* bridge */ /* synthetic */ TypedArray obtainTypedArray(int i) {
        return super.obtainTypedArray(i);
    }

    @Override // p001o.rqe, android.content.res.Resources
    public /* bridge */ /* synthetic */ InputStream openRawResource(int i) {
        return super.openRawResource(i);
    }

    @Override // p001o.rqe, android.content.res.Resources
    public /* bridge */ /* synthetic */ AssetFileDescriptor openRawResourceFd(int i) {
        return super.openRawResourceFd(i);
    }

    @Override // p001o.rqe, android.content.res.Resources
    public /* bridge */ /* synthetic */ void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        super.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // p001o.rqe, android.content.res.Resources
    public /* bridge */ /* synthetic */ void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) throws XmlPullParserException, IOException {
        super.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // p001o.rqe, android.content.res.Resources
    public /* bridge */ /* synthetic */ void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) {
        Context context = (Context) this.f29207b.get();
        return context != null ? poe.m43968g().m43985s(context, this, i) : m47073a(i);
    }

    @Override // p001o.rqe, android.content.res.Resources
    public /* bridge */ /* synthetic */ Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
        return super.getDrawableForDensity(i, i2, theme);
    }

    @Override // p001o.rqe, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getQuantityString(int i, int i2, Object[] objArr) {
        return super.getQuantityString(i, i2, objArr);
    }

    @Override // p001o.rqe, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getString(int i, Object[] objArr) {
        return super.getString(i, objArr);
    }

    @Override // p001o.rqe, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence getText(int i, CharSequence charSequence) {
        return super.getText(i, charSequence);
    }

    @Override // p001o.rqe, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValue(String str, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        super.getValue(str, typedValue, z);
    }

    @Override // p001o.rqe, android.content.res.Resources
    public /* bridge */ /* synthetic */ InputStream openRawResource(int i, TypedValue typedValue) {
        return super.openRawResource(i, typedValue);
    }
}
