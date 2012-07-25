/**
 *  Img 2 base64 <Easy image to base64 script>
 *  Copyright (C) 2012 Jorge Garrido Oval (aka: FireZenk)
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.firezenk.img2base64

import org.apache.commons.codec.binary.Base64

class IMG2BASE64 {
    
    static void main(String[] args) {
        
        args.each {

            println "\nImage to base 64:\n${Base64.encodeBase64String( new File(it).bytes )}"
            
        }
        
    }

}