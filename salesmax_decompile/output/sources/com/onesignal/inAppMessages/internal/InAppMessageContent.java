package com.onesignal.inAppMessages.internal;

import com.onesignal.common.JSONObjectExtensionsKt;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import org.json.JSONObject;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes6.dex */
public class InAppMessageContent {
    public static final Companion Companion = new Companion(null);
    public static final String DISPLAY_DURATION = "display_duration";
    public static final String HTML = "html";
    public static final String REMOVE_HEIGHT_MARGIN = "remove_height_margin";
    public static final String REMOVE_WIDTH_MARGIN = "remove_width_margin";
    public static final String STYLES = "styles";
    private String contentHtml;
    private Double displayDuration;
    private WebViewManager.Position displayLocation;
    private boolean isFullBleed;
    private int pageHeight;
    private boolean useHeightMargin;
    private boolean useWidthMargin;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    public InAppMessageContent(JSONObject jSONObject) {
        Boolean boolSafeBool;
        Boolean boolSafeBool2;
        sq8.m48649h(jSONObject, "jsonObject");
        this.useHeightMargin = true;
        this.useWidthMargin = true;
        this.contentHtml = JSONObjectExtensionsKt.safeString(jSONObject, HTML);
        this.displayDuration = JSONObjectExtensionsKt.safeDouble(jSONObject, DISPLAY_DURATION);
        JSONObject jSONObjectSafeJSONObject = JSONObjectExtensionsKt.safeJSONObject(jSONObject, STYLES);
        boolean zBooleanValue = false;
        this.useHeightMargin = !((jSONObjectSafeJSONObject == null || (boolSafeBool2 = JSONObjectExtensionsKt.safeBool(jSONObjectSafeJSONObject, REMOVE_HEIGHT_MARGIN)) == null) ? false : boolSafeBool2.booleanValue());
        if (jSONObjectSafeJSONObject != null && (boolSafeBool = JSONObjectExtensionsKt.safeBool(jSONObjectSafeJSONObject, REMOVE_WIDTH_MARGIN)) != null) {
            zBooleanValue = boolSafeBool.booleanValue();
        }
        this.useWidthMargin = !zBooleanValue;
        this.isFullBleed = !this.useHeightMargin;
    }

    public final String getContentHtml() {
        return this.contentHtml;
    }

    public final Double getDisplayDuration() {
        return this.displayDuration;
    }

    public final WebViewManager.Position getDisplayLocation() {
        return this.displayLocation;
    }

    public final int getPageHeight() {
        return this.pageHeight;
    }

    public final boolean getUseHeightMargin() {
        return this.useHeightMargin;
    }

    public final boolean getUseWidthMargin() {
        return this.useWidthMargin;
    }

    public final boolean isFullBleed() {
        return this.isFullBleed;
    }

    public final void setContentHtml(String str) {
        this.contentHtml = str;
    }

    public final void setDisplayDuration(Double d) {
        this.displayDuration = d;
    }

    public final void setDisplayLocation(WebViewManager.Position position) {
        this.displayLocation = position;
    }

    public final void setFullBleed(boolean z) {
        this.isFullBleed = z;
    }

    public final void setPageHeight(int i) {
        this.pageHeight = i;
    }

    public final void setUseHeightMargin(boolean z) {
        this.useHeightMargin = z;
    }

    public final void setUseWidthMargin(boolean z) {
        this.useWidthMargin = z;
    }
}
