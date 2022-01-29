/*
 * Copyright (C) 2022 Manpreet
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; version 2
 * of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package com.generic.practice;




/**
 * @author SAM
 *
 */


public class Animal {

	/**
	 * 
	 */
	private String name;
	
	public Animal() {
		
	}
	
	public void getText()
	{
		System.out.println("Hello World "+name);
	}

	public void reverseGetText(String name) {
		//[]
		//[ 0   1   2   3   4   5   6   7   8 ]
		
		for(int i = name.length()-1; i >= 0; i--)
		{
			System.out.print(name.charAt(i));
		}
	}
	
	public void countchar(String name,char ch)
	{
		int count = 0;
		for(int i = 0; i < name.length(); i++)
		{
			if(name.charAt(i) == ch)
			{
				count++;
			}
		}
		System.out.println("'"+ch+"' found: "+count+" time(s) in "+name);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
