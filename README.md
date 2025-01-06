# 🐉 DragonBall Adventure
![image](https://github.com/user-attachments/assets/3e7c153f-3047-4770-a6a4-7ba0b040ecde)
![image](https://github.com/user-attachments/assets/6654f38a-a13a-4f36-861e-b2d4caaa1491)

## 📝 Description
A DragonBall-inspired platformer developed in Java, created as a self-study project in my third year of high school. The game combines classic platforming mechanics with DragonBall's iconic transformation system and combat mechanics, featuring a comprehensive level design system and enemy AI.
## ⭐ Key Features

- Complete transformation system (Super Saiyan 1, 3, and God forms)
- Combat system with projectile attacks
- Enemy AI with health tracking
- Super Mario-style platforming
- Pixel map-based level design
- Full animation system
- Audio system with music and sound effects
- Progress save system

## 🎮 Gameplay Mechanics
### Character Abilities

- Basic Movement: Left/Right movement, Jumping
- Combat: Energy projectiles (Space bar)
- Transformations:
    - Super Saiyan 1 (Key 1)
    - Super Saiyan 3 (Key 3)
    - Super Saiyan God (Key 4)
- Power scaling with each transformation:
    - Increased movement speed
    - Enhanced attack damage

![image](https://github.com/user-attachments/assets/7dcd7435-916a-412b-9179-200720a3eaa3)

### DragonBalls System

- Collect DragonBalls scattered throughout levels
- Required for transformation unlocks
- Progress tracking
- Special effects upon collection

### Combat System
![image](https://github.com/user-attachments/assets/ba18cff3-9aa0-4a14-948c-12db4931dddf)

- Projectile-based combat
- Enemy health bars
- Hitbox detection
- Damage scaling with transformations
- Combat animations

![image](https://github.com/user-attachments/assets/d0f80709-7895-4b3b-a0ea-21f359ff3565)

## 🛠️ Technical Implementation
- Physics Engine
    - Gravity simulation
    - Jump mechanics
    - Projectile trajectories
    - Collision detection
    - Character momentum

- Animation System
    - Character movement animations
    - Transformation sequences
    - Attack animations
    - Enemy reactions
    - Particle effects

- Level Design System
    - Pixel Map Color Coding

- Audio System
    - Background music per level
    - Transformation sound effects
    - Combat sounds
    - Collection effects
    - Menu sounds

- Enemy AI
    - Difficulty scaling
    - Health management
    - Behavior states

## ⚙️ Technical Requirements

- Java Runtime Environment (JRE) 8 or higher
- Minimum Resolution: 1024x768
- Sound card for audio features

## 🚀 Installation

Clone the repository:
```bash
git clone https://github.com/yourusername/dragonball-adventure.git
```
Navigate to project directory:
```bash
cd dragonballgame\src\com\game
```
Compile and run:
```bash
bashCopyjavac Game.java
java Game
```
## 🎯 Game Features
- Main Menu
    - Level selection
    - Tutorial access
    - Save game management
    - Options configuration

- Save System
    - Progress tracking
    - Collected DragonBalls
    - Unlocked transformations
    - Level completion status

## 🔧 Technical Challenges Solved
- Physics Implementation
    - Gravity calculations
    - Jump arc optimization
    - Attack projectile patterns
    - Collision response

- Animation Management
    - Sprite sheet handling
    - Transform sequence timing
    - Hitbox synchronization
    - State management

- AI Development
    - Enemy behavior patterns
    - Difficulty balance
    - Response systems

## 🎨 Level Creation Guide
![image](https://github.com/user-attachments/assets/83894cae-eca5-4ae1-b07e-6d7b75a73015)

1. Create new image in Paint
2. Use color coding system
3. Save as PNG in levels directory

## 💾 Development Insights
Major challenges overcome:

- Implementing smooth physics for jumps and attacks
- Creating responsive AI behaviors
- Managing complex animation states
- Synchronizing audio with actions
- Designing intuitive level creation system
- Implementing accurate hitbox detection

## 📜 License
This project is open source and available under the MIT License.
## ✨ Acknowledgments
- DragonBall creators for inspiration
- Super Mario for platforming inspiration
- High school CS department
- Java game development community
