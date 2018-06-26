
class Department {
    Manager boss
}

class Manager {
    String name
}

def d = new Department(boss: new Manager(name: 'Mr Burns'))
println d.boss.name

d = new Department()
println d?.boss?.name
