package type;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class AddressInput implements InputType {
    private final Input<String> addressType;
    private final Input<String> area;
    private final Input<String> city;
    private final Input<String> country;
    private final Input<String> establishmentName;
    private final Input<String> googlePlaceId;
    private final Input<Boolean> isPrimaryAddress;
    private final Input<String> landmark;
    private final Input<String> lat;
    private final Input<String> lng;
    private final Input<String> rawAddressText;
    private final Input<String> region;
    private final Input<String> state;
    private final Input<String> streetAddress;
    private final Input<String> zipcode;

    public static final class Builder {
        private Input<String> addressType = Input.absent();
        private Input<String> establishmentName = Input.absent();
        private Input<String> area = Input.absent();
        private Input<String> city = Input.absent();
        private Input<String> country = Input.absent();
        private Input<String> googlePlaceId = Input.absent();
        private Input<Boolean> isPrimaryAddress = Input.absent();
        private Input<String> landmark = Input.absent();
        private Input<String> lat = Input.absent();
        private Input<String> lng = Input.absent();
        private Input<String> rawAddressText = Input.absent();
        private Input<String> region = Input.absent();
        private Input<String> state = Input.absent();
        private Input<String> streetAddress = Input.absent();
        private Input<String> zipcode = Input.absent();

        public Builder addressType(String str) {
            this.addressType = Input.fromNullable(str);
            return this;
        }

        public Builder area(String str) {
            this.area = Input.fromNullable(str);
            return this;
        }

        public AddressInput build() {
            return new AddressInput(this.addressType, this.establishmentName, this.area, this.city, this.country, this.googlePlaceId, this.isPrimaryAddress, this.landmark, this.lat, this.lng, this.rawAddressText, this.region, this.state, this.streetAddress, this.zipcode);
        }

        public Builder city(String str) {
            this.city = Input.fromNullable(str);
            return this;
        }

        public Builder country(String str) {
            this.country = Input.fromNullable(str);
            return this;
        }

        public Builder establishmentName(String str) {
            this.establishmentName = Input.fromNullable(str);
            return this;
        }

        public Builder googlePlaceId(String str) {
            this.googlePlaceId = Input.fromNullable(str);
            return this;
        }

        public Builder isPrimaryAddress(Boolean bool) {
            this.isPrimaryAddress = Input.fromNullable(bool);
            return this;
        }

        public Builder landmark(String str) {
            this.landmark = Input.fromNullable(str);
            return this;
        }

        public Builder lat(String str) {
            this.lat = Input.fromNullable(str);
            return this;
        }

        public Builder lng(String str) {
            this.lng = Input.fromNullable(str);
            return this;
        }

        public Builder rawAddressText(String str) {
            this.rawAddressText = Input.fromNullable(str);
            return this;
        }

        public Builder region(String str) {
            this.region = Input.fromNullable(str);
            return this;
        }

        public Builder state(String str) {
            this.state = Input.fromNullable(str);
            return this;
        }

        public Builder streetAddress(String str) {
            this.streetAddress = Input.fromNullable(str);
            return this;
        }

        public Builder zipcode(String str) {
            this.zipcode = Input.fromNullable(str);
            return this;
        }
    }

    public AddressInput(Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<Boolean> input7, Input<String> input8, Input<String> input9, Input<String> input10, Input<String> input11, Input<String> input12, Input<String> input13, Input<String> input14, Input<String> input15) {
        this.addressType = input;
        this.establishmentName = input2;
        this.area = input3;
        this.city = input4;
        this.country = input5;
        this.googlePlaceId = input6;
        this.isPrimaryAddress = input7;
        this.landmark = input8;
        this.lat = input9;
        this.lng = input10;
        this.rawAddressText = input11;
        this.region = input12;
        this.state = input13;
        this.streetAddress = input14;
        this.zipcode = input15;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String addressType() {
        return this.addressType.value;
    }

    public String area() {
        return this.area.value;
    }

    public String city() {
        return this.city.value;
    }

    public String country() {
        return this.country.value;
    }

    public String establishmentName() {
        return this.establishmentName.value;
    }

    public String googlePlaceId() {
        return this.googlePlaceId.value;
    }

    public Boolean isPrimaryAddress() {
        return this.isPrimaryAddress.value;
    }

    public String landmark() {
        return this.landmark.value;
    }

    public String lat() {
        return this.lat.value;
    }

    public String lng() {
        return this.lng.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.AddressInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (AddressInput.this.addressType.defined) {
                    inputFieldWriter.writeString("addressType", (String) AddressInput.this.addressType.value);
                }
                if (AddressInput.this.establishmentName.defined) {
                    inputFieldWriter.writeString("establishmentName", (String) AddressInput.this.establishmentName.value);
                }
                if (AddressInput.this.area.defined) {
                    inputFieldWriter.writeString("area", (String) AddressInput.this.area.value);
                }
                if (AddressInput.this.city.defined) {
                    inputFieldWriter.writeString("city", (String) AddressInput.this.city.value);
                }
                if (AddressInput.this.country.defined) {
                    inputFieldWriter.writeString("country", (String) AddressInput.this.country.value);
                }
                if (AddressInput.this.googlePlaceId.defined) {
                    inputFieldWriter.writeString("googlePlaceId", (String) AddressInput.this.googlePlaceId.value);
                }
                if (AddressInput.this.isPrimaryAddress.defined) {
                    inputFieldWriter.writeBoolean("isPrimaryAddress", (Boolean) AddressInput.this.isPrimaryAddress.value);
                }
                if (AddressInput.this.landmark.defined) {
                    inputFieldWriter.writeString("landmark", (String) AddressInput.this.landmark.value);
                }
                if (AddressInput.this.lat.defined) {
                    inputFieldWriter.writeString("lat", (String) AddressInput.this.lat.value);
                }
                if (AddressInput.this.lng.defined) {
                    inputFieldWriter.writeString("lng", (String) AddressInput.this.lng.value);
                }
                if (AddressInput.this.rawAddressText.defined) {
                    inputFieldWriter.writeString("rawAddressText", (String) AddressInput.this.rawAddressText.value);
                }
                if (AddressInput.this.region.defined) {
                    inputFieldWriter.writeString(TransferTable.COLUMN_REGION, (String) AddressInput.this.region.value);
                }
                if (AddressInput.this.state.defined) {
                    inputFieldWriter.writeString("state", (String) AddressInput.this.state.value);
                }
                if (AddressInput.this.streetAddress.defined) {
                    inputFieldWriter.writeString("streetAddress", (String) AddressInput.this.streetAddress.value);
                }
                if (AddressInput.this.zipcode.defined) {
                    inputFieldWriter.writeString("zipcode", (String) AddressInput.this.zipcode.value);
                }
            }
        };
    }

    public String rawAddressText() {
        return this.rawAddressText.value;
    }

    public String region() {
        return this.region.value;
    }

    public String state() {
        return this.state.value;
    }

    public String streetAddress() {
        return this.streetAddress.value;
    }

    public String zipcode() {
        return this.zipcode.value;
    }
}
