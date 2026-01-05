package org.bouncycastle.asn1.x500.style;

import com.sun.mail.imap.IMAPStore;
import java.util.Hashtable;
import mm.AbstractC4801l;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.X500NameStyle;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;

/* loaded from: classes3.dex */
public class BCStyle extends AbstractX500NameStyle {
    public static final ASN1ObjectIdentifier BUSINESS_CATEGORY;

    /* renamed from: C */
    public static final ASN1ObjectIdentifier f27516C;
    public static final ASN1ObjectIdentifier CN;
    public static final ASN1ObjectIdentifier COUNTRY_OF_CITIZENSHIP;
    public static final ASN1ObjectIdentifier COUNTRY_OF_RESIDENCE;
    public static final ASN1ObjectIdentifier DATE_OF_BIRTH;
    public static final ASN1ObjectIdentifier DC;
    public static final ASN1ObjectIdentifier DESCRIPTION;
    public static final ASN1ObjectIdentifier DMD_NAME;
    public static final ASN1ObjectIdentifier DN_QUALIFIER;
    private static final Hashtable DefaultLookUp;
    private static final Hashtable DefaultSymbols;

    /* renamed from: E */
    public static final ASN1ObjectIdentifier f27517E;
    public static final ASN1ObjectIdentifier EmailAddress;
    public static final ASN1ObjectIdentifier GENDER;
    public static final ASN1ObjectIdentifier GENERATION;
    public static final ASN1ObjectIdentifier GIVENNAME;
    public static final ASN1ObjectIdentifier INITIALS;
    public static final X500NameStyle INSTANCE;

    /* renamed from: L */
    public static final ASN1ObjectIdentifier f27518L;
    public static final ASN1ObjectIdentifier NAME;
    public static final ASN1ObjectIdentifier NAME_AT_BIRTH;

    /* renamed from: O */
    public static final ASN1ObjectIdentifier f27519O;
    public static final ASN1ObjectIdentifier ORGANIZATION_IDENTIFIER;
    public static final ASN1ObjectIdentifier OU;
    public static final ASN1ObjectIdentifier PLACE_OF_BIRTH;
    public static final ASN1ObjectIdentifier POSTAL_ADDRESS;
    public static final ASN1ObjectIdentifier POSTAL_CODE;
    public static final ASN1ObjectIdentifier PSEUDONYM;
    public static final ASN1ObjectIdentifier ROLE;
    public static final ASN1ObjectIdentifier SERIALNUMBER;
    public static final ASN1ObjectIdentifier SN;
    public static final ASN1ObjectIdentifier ST;
    public static final ASN1ObjectIdentifier STREET;
    public static final ASN1ObjectIdentifier SURNAME;

    /* renamed from: T */
    public static final ASN1ObjectIdentifier f27520T;
    public static final ASN1ObjectIdentifier TELEPHONE_NUMBER;
    public static final ASN1ObjectIdentifier UID;
    public static final ASN1ObjectIdentifier UNIQUE_IDENTIFIER;
    public static final ASN1ObjectIdentifier UnstructuredAddress;
    public static final ASN1ObjectIdentifier UnstructuredName;
    protected final Hashtable defaultSymbols = AbstractX500NameStyle.copyHashTable(DefaultSymbols);
    protected final Hashtable defaultLookUp = AbstractX500NameStyle.copyHashTable(DefaultLookUp);

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t = AbstractC4801l.m9746t("2.5.4.6");
        f27516C = aSN1ObjectIdentifierM9746t;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t2 = AbstractC4801l.m9746t("2.5.4.10");
        f27519O = aSN1ObjectIdentifierM9746t2;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t3 = AbstractC4801l.m9746t("2.5.4.11");
        OU = aSN1ObjectIdentifierM9746t3;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t4 = AbstractC4801l.m9746t("2.5.4.12");
        f27520T = aSN1ObjectIdentifierM9746t4;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t5 = AbstractC4801l.m9746t("2.5.4.3");
        CN = aSN1ObjectIdentifierM9746t5;
        SN = AbstractC4801l.m9746t("2.5.4.5");
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t6 = AbstractC4801l.m9746t("2.5.4.9");
        STREET = aSN1ObjectIdentifierM9746t6;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t7 = AbstractC4801l.m9746t("2.5.4.5");
        SERIALNUMBER = aSN1ObjectIdentifierM9746t7;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t8 = AbstractC4801l.m9746t("2.5.4.7");
        f27518L = aSN1ObjectIdentifierM9746t8;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t9 = AbstractC4801l.m9746t("2.5.4.8");
        ST = aSN1ObjectIdentifierM9746t9;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t10 = AbstractC4801l.m9746t("2.5.4.4");
        SURNAME = aSN1ObjectIdentifierM9746t10;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t11 = AbstractC4801l.m9746t("2.5.4.42");
        GIVENNAME = aSN1ObjectIdentifierM9746t11;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t12 = AbstractC4801l.m9746t("2.5.4.43");
        INITIALS = aSN1ObjectIdentifierM9746t12;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t13 = AbstractC4801l.m9746t("2.5.4.44");
        GENERATION = aSN1ObjectIdentifierM9746t13;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t14 = AbstractC4801l.m9746t("2.5.4.45");
        UNIQUE_IDENTIFIER = aSN1ObjectIdentifierM9746t14;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t15 = AbstractC4801l.m9746t("2.5.4.13");
        DESCRIPTION = aSN1ObjectIdentifierM9746t15;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t16 = AbstractC4801l.m9746t("2.5.4.15");
        BUSINESS_CATEGORY = aSN1ObjectIdentifierM9746t16;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t17 = AbstractC4801l.m9746t("2.5.4.17");
        POSTAL_CODE = aSN1ObjectIdentifierM9746t17;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t18 = AbstractC4801l.m9746t("2.5.4.46");
        DN_QUALIFIER = aSN1ObjectIdentifierM9746t18;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t19 = AbstractC4801l.m9746t("2.5.4.65");
        PSEUDONYM = aSN1ObjectIdentifierM9746t19;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t20 = AbstractC4801l.m9746t("2.5.4.72");
        ROLE = aSN1ObjectIdentifierM9746t20;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t21 = AbstractC4801l.m9746t("1.3.6.1.5.5.7.9.1");
        DATE_OF_BIRTH = aSN1ObjectIdentifierM9746t21;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t22 = AbstractC4801l.m9746t("1.3.6.1.5.5.7.9.2");
        PLACE_OF_BIRTH = aSN1ObjectIdentifierM9746t22;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t23 = AbstractC4801l.m9746t("1.3.6.1.5.5.7.9.3");
        GENDER = aSN1ObjectIdentifierM9746t23;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t24 = AbstractC4801l.m9746t("1.3.6.1.5.5.7.9.4");
        COUNTRY_OF_CITIZENSHIP = aSN1ObjectIdentifierM9746t24;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t25 = AbstractC4801l.m9746t("1.3.6.1.5.5.7.9.5");
        COUNTRY_OF_RESIDENCE = aSN1ObjectIdentifierM9746t25;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t26 = AbstractC4801l.m9746t("1.3.36.8.3.14");
        NAME_AT_BIRTH = aSN1ObjectIdentifierM9746t26;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t27 = AbstractC4801l.m9746t("2.5.4.16");
        POSTAL_ADDRESS = aSN1ObjectIdentifierM9746t27;
        DMD_NAME = AbstractC4801l.m9746t("2.5.4.54");
        ASN1ObjectIdentifier aSN1ObjectIdentifier = X509ObjectIdentifiers.id_at_telephoneNumber;
        TELEPHONE_NUMBER = aSN1ObjectIdentifier;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = X509ObjectIdentifiers.id_at_name;
        NAME = aSN1ObjectIdentifier2;
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = X509ObjectIdentifiers.id_at_organizationIdentifier;
        ORGANIZATION_IDENTIFIER = aSN1ObjectIdentifier3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = PKCSObjectIdentifiers.pkcs_9_at_emailAddress;
        EmailAddress = aSN1ObjectIdentifier4;
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = PKCSObjectIdentifiers.pkcs_9_at_unstructuredName;
        UnstructuredName = aSN1ObjectIdentifier5;
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = PKCSObjectIdentifiers.pkcs_9_at_unstructuredAddress;
        UnstructuredAddress = aSN1ObjectIdentifier6;
        f27517E = aSN1ObjectIdentifier4;
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = new ASN1ObjectIdentifier("0.9.2342.19200300.100.1.25");
        DC = aSN1ObjectIdentifier7;
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = new ASN1ObjectIdentifier("0.9.2342.19200300.100.1.1");
        UID = aSN1ObjectIdentifier8;
        Hashtable hashtable = new Hashtable();
        DefaultSymbols = hashtable;
        Hashtable hashtable2 = new Hashtable();
        DefaultLookUp = hashtable2;
        hashtable.put(aSN1ObjectIdentifierM9746t, "C");
        hashtable.put(aSN1ObjectIdentifierM9746t2, "O");
        hashtable.put(aSN1ObjectIdentifierM9746t4, "T");
        hashtable.put(aSN1ObjectIdentifierM9746t3, "OU");
        hashtable.put(aSN1ObjectIdentifierM9746t5, "CN");
        hashtable.put(aSN1ObjectIdentifierM9746t8, "L");
        hashtable.put(aSN1ObjectIdentifierM9746t9, "ST");
        hashtable.put(aSN1ObjectIdentifierM9746t7, "SERIALNUMBER");
        hashtable.put(aSN1ObjectIdentifier4, "E");
        hashtable.put(aSN1ObjectIdentifier7, "DC");
        hashtable.put(aSN1ObjectIdentifier8, "UID");
        hashtable.put(aSN1ObjectIdentifierM9746t6, "STREET");
        hashtable.put(aSN1ObjectIdentifierM9746t10, "SURNAME");
        hashtable.put(aSN1ObjectIdentifierM9746t11, "GIVENNAME");
        hashtable.put(aSN1ObjectIdentifierM9746t12, "INITIALS");
        hashtable.put(aSN1ObjectIdentifierM9746t13, "GENERATION");
        hashtable.put(aSN1ObjectIdentifierM9746t15, "DESCRIPTION");
        hashtable.put(aSN1ObjectIdentifierM9746t20, "ROLE");
        hashtable.put(aSN1ObjectIdentifier6, "unstructuredAddress");
        hashtable.put(aSN1ObjectIdentifier5, "unstructuredName");
        hashtable.put(aSN1ObjectIdentifierM9746t14, "UniqueIdentifier");
        hashtable.put(aSN1ObjectIdentifierM9746t18, "DN");
        hashtable.put(aSN1ObjectIdentifierM9746t19, "Pseudonym");
        hashtable.put(aSN1ObjectIdentifierM9746t27, "PostalAddress");
        hashtable.put(aSN1ObjectIdentifierM9746t26, "NameAtBirth");
        hashtable.put(aSN1ObjectIdentifierM9746t24, "CountryOfCitizenship");
        hashtable.put(aSN1ObjectIdentifierM9746t25, "CountryOfResidence");
        hashtable.put(aSN1ObjectIdentifierM9746t23, "Gender");
        hashtable.put(aSN1ObjectIdentifierM9746t22, "PlaceOfBirth");
        hashtable.put(aSN1ObjectIdentifierM9746t21, "DateOfBirth");
        hashtable.put(aSN1ObjectIdentifierM9746t17, "PostalCode");
        hashtable.put(aSN1ObjectIdentifierM9746t16, "BusinessCategory");
        hashtable.put(aSN1ObjectIdentifier, "TelephoneNumber");
        hashtable.put(aSN1ObjectIdentifier2, "Name");
        hashtable.put(aSN1ObjectIdentifier3, "organizationIdentifier");
        hashtable2.put("c", aSN1ObjectIdentifierM9746t);
        hashtable2.put("o", aSN1ObjectIdentifierM9746t2);
        hashtable2.put("t", aSN1ObjectIdentifierM9746t4);
        hashtable2.put("ou", aSN1ObjectIdentifierM9746t3);
        hashtable2.put("cn", aSN1ObjectIdentifierM9746t5);
        hashtable2.put("l", aSN1ObjectIdentifierM9746t8);
        hashtable2.put("st", aSN1ObjectIdentifierM9746t9);
        hashtable2.put("sn", aSN1ObjectIdentifierM9746t10);
        hashtable2.put("serialnumber", aSN1ObjectIdentifierM9746t7);
        hashtable2.put("street", aSN1ObjectIdentifierM9746t6);
        hashtable2.put("emailaddress", aSN1ObjectIdentifier4);
        hashtable2.put("dc", aSN1ObjectIdentifier7);
        hashtable2.put("e", aSN1ObjectIdentifier4);
        hashtable2.put("uid", aSN1ObjectIdentifier8);
        hashtable2.put("surname", aSN1ObjectIdentifierM9746t10);
        hashtable2.put("givenname", aSN1ObjectIdentifierM9746t11);
        hashtable2.put("initials", aSN1ObjectIdentifierM9746t12);
        hashtable2.put("generation", aSN1ObjectIdentifierM9746t13);
        hashtable2.put("description", aSN1ObjectIdentifierM9746t15);
        hashtable2.put("role", aSN1ObjectIdentifierM9746t20);
        hashtable2.put("unstructuredaddress", aSN1ObjectIdentifier6);
        hashtable2.put("unstructuredname", aSN1ObjectIdentifier5);
        hashtable2.put("uniqueidentifier", aSN1ObjectIdentifierM9746t14);
        hashtable2.put("dn", aSN1ObjectIdentifierM9746t18);
        hashtable2.put("pseudonym", aSN1ObjectIdentifierM9746t19);
        hashtable2.put("postaladdress", aSN1ObjectIdentifierM9746t27);
        hashtable2.put("nameatbirth", aSN1ObjectIdentifierM9746t26);
        hashtable2.put("countryofcitizenship", aSN1ObjectIdentifierM9746t24);
        hashtable2.put("countryofresidence", aSN1ObjectIdentifierM9746t25);
        hashtable2.put("gender", aSN1ObjectIdentifierM9746t23);
        hashtable2.put("placeofbirth", aSN1ObjectIdentifierM9746t22);
        hashtable2.put("dateofbirth", aSN1ObjectIdentifierM9746t21);
        hashtable2.put("postalcode", aSN1ObjectIdentifierM9746t17);
        hashtable2.put("businesscategory", aSN1ObjectIdentifierM9746t16);
        hashtable2.put("telephonenumber", aSN1ObjectIdentifier);
        hashtable2.put(IMAPStore.ID_NAME, aSN1ObjectIdentifier2);
        hashtable2.put("organizationidentifier", aSN1ObjectIdentifier3);
        INSTANCE = new BCStyle();
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public ASN1ObjectIdentifier attrNameToOID(String str) {
        return IETFUtils.decodeAttrName(str, this.defaultLookUp);
    }

    @Override // org.bouncycastle.asn1.x500.style.AbstractX500NameStyle
    public ASN1Encodable encodeStringValue(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        return (aSN1ObjectIdentifier.equals((ASN1Primitive) EmailAddress) || aSN1ObjectIdentifier.equals((ASN1Primitive) DC)) ? new DERIA5String(str) : aSN1ObjectIdentifier.equals((ASN1Primitive) DATE_OF_BIRTH) ? new ASN1GeneralizedTime(str) : (aSN1ObjectIdentifier.equals((ASN1Primitive) f27516C) || aSN1ObjectIdentifier.equals((ASN1Primitive) SERIALNUMBER) || aSN1ObjectIdentifier.equals((ASN1Primitive) DN_QUALIFIER) || aSN1ObjectIdentifier.equals((ASN1Primitive) TELEPHONE_NUMBER)) ? new DERPrintableString(str) : super.encodeStringValue(aSN1ObjectIdentifier, str);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public RDN[] fromString(String str) {
        return IETFUtils.rDNsFromString(str, this);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public String[] oidToAttrNames(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return IETFUtils.findAttrNamesForOID(aSN1ObjectIdentifier, this.defaultLookUp);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public String oidToDisplayName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (String) this.defaultSymbols.get(aSN1ObjectIdentifier);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public String toString(X500Name x500Name) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z6 = true;
        for (RDN rdn : x500Name.getRDNs()) {
            if (z6) {
                z6 = false;
            } else {
                stringBuffer.append(',');
            }
            IETFUtils.appendRDN(stringBuffer, rdn, this.defaultSymbols);
        }
        return stringBuffer.toString();
    }
}
