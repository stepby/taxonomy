/**
 * Copyright (C) 2003-2011 eXo Platform SAS.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation; either version 3
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, see<http://www.gnu.org/licenses/>.
 */
package taxonomy.model;


/**
 * @author <a href="mailto:haint@exoplatform.com">Nguyen Thanh Hai</a>
 *
 * @datOct 5, 2011
 */
public class Species implements IModel
{
   /**
    * 
    */
   private static final long serialVersionUID = 7786592453483689955L;

   private int id;
   
   private String name;
   
   private String oldName;
   
   private String synonymName;
   
   public void setId(int id)
   {
      this.id = id;
   }
   
   public int getId()
   {
      return id;
   }
   
   public void setName(String name)
   {
      this.name = name;
   }
   
   public String getName()
   {
      return name;
   }
   
   public void setOldName(String oldName)
   {
      this.oldName = oldName;
   }
   
   public String getOldName()
   {
      return oldName;
   }
   
   public void setSynonymName(String synonymName)
   {
      this.synonymName = synonymName;
   }
   
   public String getSynonymName()
   {
      return synonymName;
   }
}
