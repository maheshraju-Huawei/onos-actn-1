/*
 * Copyright 2016-present Open Networking Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onosproject.isis.io.isispacket.tlv.subtlv;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Representation of sub tlv type.
 */
public enum SubTlvType {
    ADMINISTRATIVEGROUP(9),
    MAXIMUMBANDWIDTH(6),
    MAXIMUMRESERVABLEBANDWIDTH(7),
    TRAFFICENGINEERINGMETRIC(5),
    UNRESERVEDBANDWIDTH(8);

    // Reverse lookup table
    private static final Map<Integer, SubTlvType> LOOKUP = new HashMap<>();

    // Populate the lookup table on loading time
    static {
        for (SubTlvType subTlvType : EnumSet.allOf(SubTlvType.class)) {
            LOOKUP.put(subTlvType.value(), subTlvType);
        }
    }

    private int value;

    /**
     * Sets the  sub TLV type value.
     *
     * @param value value.
     */
    SubTlvType(int value) {
        this.value = value;
    }

    /**
     * Returns the enum instance from type value - reverse lookup purpose.
     *
     * @param subTlvTypeValue TLV type value
     * @return ISIS  sub TLV type instance
     */
    public static SubTlvType get(int subTlvTypeValue) {
        return LOOKUP.get(subTlvTypeValue);
    }

    /**
     * Returns value.
     *
     * @return value
     */
    public int value() {
        return value;
    }
}
