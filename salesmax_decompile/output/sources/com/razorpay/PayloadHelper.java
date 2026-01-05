package com.razorpay;

import com.amplifyframework.core.model.ModelIdentifier;
import com.google.android.gms.cast.MediaTrack;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.e9g;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class PayloadHelper {
    private Boolean allowRotation;
    private int amount;
    private String backDropColor;
    private String callbackUrl;
    private String color;
    private String currency;
    private String customerId;
    private String description;
    private Boolean hideTopBar;
    private String image;
    private Boolean modalConfirmClose;
    private String name;
    private JSONObject notes;
    private String orderId;
    private String prefillCardCvv;
    private String prefillCardExp;
    private String prefillCardNum;
    private String prefillContact;
    private String prefillEmail;
    private String prefillMethod;
    private String prefillName;
    private Boolean readOnlyContact;
    private Boolean readOnlyEmail;
    private Boolean readOnlyName;
    private Object recurring;
    private Boolean redirect;
    private Boolean rememberCustomer;
    private Boolean retryEnabled;
    private Integer retryMaxCount;
    private Boolean sendSmsHash;
    private Boolean subscriptionCardChange;
    private String subscriptionId;
    private Integer timeout;

    public PayloadHelper(String str, int i, String str2) {
        sq8.m48649h(str, FirebaseAnalytics.Param.CURRENCY);
        sq8.m48649h(str2, "orderId");
        this.currency = str;
        this.amount = i;
        this.orderId = str2;
    }

    public final Boolean getAllowRotation() {
        return this.allowRotation;
    }

    public final int getAmount() {
        return this.amount;
    }

    public final String getBackDropColor() {
        return this.backDropColor;
    }

    public final String getCallbackUrl() {
        return this.callbackUrl;
    }

    public final String getColor() {
        return this.color;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getCustomerId() {
        return this.customerId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Boolean getHideTopBar() {
        return this.hideTopBar;
    }

    public final String getImage() {
        return this.image;
    }

    public final JSONObject getJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        try {
            jSONObject.put(FirebaseAnalytics.Param.CURRENCY, this.currency);
            jSONObject.put("amount", this.amount);
            if (!e9g.m24597K(this.orderId, "order_", false, 2, null)) {
                JSONObject jSONObjectPut = new JSONObject().put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Invalid order id. Order ID starts with order_");
                sq8.m48648g(jSONObjectPut, "JSONObject().put(\"error\"…r ID starts with order_\")");
                return jSONObjectPut;
            }
            jSONObject.put("order_id", this.orderId);
            Object obj = this.name;
            if (obj != null) {
                jSONObject.put("name", obj);
            }
            Object obj2 = this.description;
            if (obj2 != null) {
                jSONObject.put(MediaTrack.ROLE_DESCRIPTION, obj2);
            }
            Object obj3 = this.image;
            if (obj3 != null) {
                jSONObject.put("image", obj3);
            }
            String str = this.prefillName;
            if (str != null) {
                jSONObject3.put("name", str);
            }
            String str2 = this.prefillContact;
            if (str2 != null) {
                jSONObject3.put("contact", str2);
            }
            String str3 = this.prefillEmail;
            if (str3 != null) {
                jSONObject3.put("email", str3);
            }
            String str4 = this.prefillMethod;
            if (str4 != null) {
                jSONObject3.put(FirebaseAnalytics.Param.METHOD, str4);
            }
            String str5 = this.prefillCardNum;
            if (str5 != null) {
                jSONObject3.put("card[number]", str5);
            }
            String str6 = this.prefillCardExp;
            if (str6 != null) {
                jSONObject3.put("card[expiry]", str6);
            }
            String str7 = this.prefillCardCvv;
            if (str7 != null) {
                jSONObject3.put("card[cvv]", str7);
            }
            if (jSONObject3.length() > 0) {
                jSONObject.put("prefill", jSONObject3);
            }
            Object obj4 = this.notes;
            if (obj4 != null) {
                jSONObject.put("notes", obj4);
            }
            String str8 = this.color;
            if (str8 != null) {
                if (e9g.m24597K(str8, ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER, false, 2, null)) {
                    jSONObject4.put("color", str8);
                } else {
                    jSONObject4.put("color", ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + str8);
                }
            }
            Boolean bool = this.hideTopBar;
            if (bool != null) {
                jSONObject4.put("hide_topbar", bool.booleanValue());
            }
            String str9 = this.backDropColor;
            if (str9 != null) {
                if (str9.length() != 6) {
                    JSONObject jSONObjectPut2 = new JSONObject().put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Invalid color value");
                    sq8.m48648g(jSONObjectPut2, "JSONObject().put(\"error\", \"Invalid color value\")");
                    return jSONObjectPut2;
                }
                if (e9g.m24597K(str9, ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER, false, 2, null)) {
                    jSONObject4.put("color", str9);
                } else {
                    jSONObject4.put("color", ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + str9);
                }
            }
            if (jSONObject4.length() > 0) {
                jSONObject.put("theme", jSONObject4);
            }
            Boolean bool2 = this.modalConfirmClose;
            if (bool2 != null) {
                boolean zBooleanValue = bool2.booleanValue();
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("confirm_close", zBooleanValue);
                jSONObject.put("modal", jSONObject5);
            }
            Object obj5 = this.subscriptionId;
            if (obj5 != null) {
                jSONObject.put("subscription_id", obj5);
            }
            Boolean bool3 = this.subscriptionCardChange;
            if (bool3 != null) {
                jSONObject.put("subscription_card_change", bool3.booleanValue());
            }
            Object obj6 = this.recurring;
            if (obj6 != null) {
                jSONObject.put("recurring", obj6);
            }
            Object obj7 = this.callbackUrl;
            if (obj7 != null) {
                jSONObject.put("callback_url", obj7);
            }
            Boolean bool4 = this.redirect;
            if (bool4 != null) {
                jSONObject.put("redirect", bool4.booleanValue());
            }
            String str10 = this.customerId;
            if (str10 != null) {
                if (!e9g.m24597K(str10, "cust_", false, 2, null)) {
                    JSONObject jSONObjectPut3 = new JSONObject().put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Invalid Customer ID. It starts with cust_");
                    sq8.m48648g(jSONObjectPut3, "JSONObject().put(\"error\"…D. It starts with cust_\")");
                    return jSONObjectPut3;
                }
                jSONObject.put("customer_id", str10);
            }
            Integer num = this.timeout;
            if (num != null) {
                jSONObject.put("timeout", num.intValue());
            }
            Boolean bool5 = this.rememberCustomer;
            if (bool5 != null) {
                jSONObject.put("remember_customer", bool5.booleanValue());
            }
            Boolean bool6 = this.retryEnabled;
            if (bool6 != null) {
                boolean zBooleanValue2 = bool6.booleanValue();
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("enabled", zBooleanValue2);
                Integer num2 = this.retryMaxCount;
                jSONObject6.put("max_count", num2 != null ? num2.intValue() : 4);
                jSONObject.put("retry", jSONObject6);
            }
            Boolean bool7 = this.readOnlyName;
            if (bool7 != null) {
                jSONObject2.put("name", bool7.booleanValue());
            }
            Boolean bool8 = this.readOnlyContact;
            if (bool8 != null) {
                jSONObject2.put("contact", bool8.booleanValue());
            }
            Boolean bool9 = this.readOnlyEmail;
            if (bool9 != null) {
                jSONObject2.put("email", bool9.booleanValue());
            }
            if (jSONObject2.length() > 0) {
                jSONObject.put("readonly", jSONObject2);
            }
            Boolean bool10 = this.allowRotation;
            if (bool10 != null) {
                jSONObject.put("allow_rotation", bool10.booleanValue());
            }
            Boolean bool11 = this.sendSmsHash;
            if (bool11 != null) {
                jSONObject.put("send_sms_hash", bool11.booleanValue());
            }
            return jSONObject;
        } catch (JSONException e) {
            JSONObject jSONObjectPut4 = new JSONObject().put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, e.getLocalizedMessage());
            sq8.m48648g(jSONObjectPut4, "JSONObject().put(\"error\", e.localizedMessage)");
            return jSONObjectPut4;
        }
    }

    public final Boolean getModalConfirmClose() {
        return this.modalConfirmClose;
    }

    public final String getName() {
        return this.name;
    }

    public final JSONObject getNotes() {
        return this.notes;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getPrefillCardCvv() {
        return this.prefillCardCvv;
    }

    public final String getPrefillCardExp() {
        return this.prefillCardExp;
    }

    public final String getPrefillCardNum() {
        return this.prefillCardNum;
    }

    public final String getPrefillContact() {
        return this.prefillContact;
    }

    public final String getPrefillEmail() {
        return this.prefillEmail;
    }

    public final String getPrefillMethod() {
        return this.prefillMethod;
    }

    public final String getPrefillName() {
        return this.prefillName;
    }

    public final Boolean getReadOnlyContact() {
        return this.readOnlyContact;
    }

    public final Boolean getReadOnlyEmail() {
        return this.readOnlyEmail;
    }

    public final Boolean getReadOnlyName() {
        return this.readOnlyName;
    }

    public final Object getRecurring() {
        return this.recurring;
    }

    public final Boolean getRedirect() {
        return this.redirect;
    }

    public final Boolean getRememberCustomer() {
        return this.rememberCustomer;
    }

    public final Boolean getRetryEnabled() {
        return this.retryEnabled;
    }

    public final Integer getRetryMaxCount() {
        return this.retryMaxCount;
    }

    public final Boolean getSendSmsHash() {
        return this.sendSmsHash;
    }

    public final Boolean getSubscriptionCardChange() {
        return this.subscriptionCardChange;
    }

    public final String getSubscriptionId() {
        return this.subscriptionId;
    }

    public final Integer getTimeout() {
        return this.timeout;
    }

    public final void setAllowRotation(Boolean bool) {
        this.allowRotation = bool;
    }

    public final void setAmount(int i) {
        this.amount = i;
    }

    public final void setBackDropColor(String str) {
        this.backDropColor = str;
    }

    public final void setCallbackUrl(String str) {
        this.callbackUrl = str;
    }

    public final void setColor(String str) {
        this.color = str;
    }

    public final void setCurrency(String str) {
        sq8.m48649h(str, "<set-?>");
        this.currency = str;
    }

    public final void setCustomerId(String str) {
        this.customerId = str;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setHideTopBar(Boolean bool) {
        this.hideTopBar = bool;
    }

    public final void setImage(String str) {
        this.image = str;
    }

    public final void setModalConfirmClose(Boolean bool) {
        this.modalConfirmClose = bool;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setNotes(JSONObject jSONObject) {
        this.notes = jSONObject;
    }

    public final void setOrderId(String str) {
        sq8.m48649h(str, "<set-?>");
        this.orderId = str;
    }

    public final void setPrefillCardCvv(String str) {
        this.prefillCardCvv = str;
    }

    public final void setPrefillCardExp(String str) {
        this.prefillCardExp = str;
    }

    public final void setPrefillCardNum(String str) {
        this.prefillCardNum = str;
    }

    public final void setPrefillContact(String str) {
        this.prefillContact = str;
    }

    public final void setPrefillEmail(String str) {
        this.prefillEmail = str;
    }

    public final void setPrefillMethod(String str) {
        this.prefillMethod = str;
    }

    public final void setPrefillName(String str) {
        this.prefillName = str;
    }

    public final void setReadOnlyContact(Boolean bool) {
        this.readOnlyContact = bool;
    }

    public final void setReadOnlyEmail(Boolean bool) {
        this.readOnlyEmail = bool;
    }

    public final void setReadOnlyName(Boolean bool) {
        this.readOnlyName = bool;
    }

    public final void setRecurring(Object obj) {
        this.recurring = obj;
    }

    public final void setRedirect(Boolean bool) {
        this.redirect = bool;
    }

    public final void setRememberCustomer(Boolean bool) {
        this.rememberCustomer = bool;
    }

    public final void setRetryEnabled(Boolean bool) {
        this.retryEnabled = bool;
    }

    public final void setRetryMaxCount(Integer num) {
        this.retryMaxCount = num;
    }

    public final void setSendSmsHash(Boolean bool) {
        this.sendSmsHash = bool;
    }

    public final void setSubscriptionCardChange(Boolean bool) {
        this.subscriptionCardChange = bool;
    }

    public final void setSubscriptionId(String str) {
        this.subscriptionId = str;
    }

    public final void setTimeout(Integer num) {
        this.timeout = num;
    }
}
