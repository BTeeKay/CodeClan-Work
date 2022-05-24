import pdb 
from models.task import Task
from models.user import User
import repositories.task_repository as task_repository
import repositories.user_repository as user_repository

task_repository.delete_all()
user_repository.delete_all()

user_1 = User("Cammy", "Wilson")
user_1 = user_repository.save(user_1)

task_1 = Task("Drinking tea", user_1, 20)
task_2 = Task("Walk Dog", user_1, 60)
task_3 = Task("Feed Cat", user_1, 5)

task_repository.save(task_1)
task_repository.save(task_2)
task_repository.save(task_3)

# found_task = task_repository.select(task_2.id)

# task_repository.delete(task_2.id)

# task_1.mark_complete()

# task_repository.update(task_1)

result = task_repository.select_all()
result2 = user_repository.tasks(user_1)

# for task in result:
#     print(task.__dict__)

for cat in result2:
    print(cat.__dict__)

pdb.set_trace()