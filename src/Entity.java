/*
 * Copyright (C) 2016 WretchedGuardian
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package kindling;

/**
 *
 * @author WretchedGuardian
 */
public class Entity {
    
    /*REMEMBER. KEEP IT SIMPLE.
    Starting off there will only be the bare variables that every item needs. 
    Originally would have liked all of the variable to carry the same variables,
    but that would make everything edible and craftable etc etc. Having items 
    subcatigorized into 'food', 'craftable', 'combustable', 'weapon', 'shelter',
    etc. will allow for the player to be restricted in what he can do but guides
    him/her into doing certian things out of lack of choice, but also makes the 
    game easier to develop.*/
    
    private String label;/*For identification*/
    private double mass;/*For lift/trasportation restriction. |v2| used in 
    calculations for fuel amount in combustable, amount of force generated in 
    weaponry, fatigue in transportation depending on how carried, load bearing 
    in structures.*/
    private double volume;/*For lift/trasportation restriction. |v2| used in 
    calcualtions for */
    
    private boolean isContained;/*check to use 'xPosition', 'yPosition'*/
    private Container container;
    private double xPosition;/*drop position for saving in mem*/
    private double yPosition; 
    
    
}
