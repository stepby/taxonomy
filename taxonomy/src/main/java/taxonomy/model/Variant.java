/*
 * Copyright (C) 2011 eXo Platform SAS.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package taxonomy.model;

public class Variant implements IModel
{
   private static final long serialVersionUID = -3236544642574185057L;
   
   private int id;
   
   private String value;
   
   public static enum Type {
      OLD, SYNONYM
   }
   
   private Type type;
   
   public void setId(int id)
   {
      this.id = id;
   }

   public int getId()
   {
      return id;
   }
   
   public void setValue(String value)
   {
      this.value = value;
   }
   
   public String getValue()
   {
      return value;
   }
   
   public void setType(Type type)
   {
      this.type = type;
   }
   
   public String getType()
   {
      return type.toString();
   }
   
   public boolean equals(Object obj)
   {
      Variant other = (Variant) obj;
      if(this.getId() == other.getId()) return true;
      return false;
   }
}
